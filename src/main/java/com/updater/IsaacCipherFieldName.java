package com.updater;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Look for the packet writer class.
 * 2. Search the class for methods which contain a while(true) loop
 * 3. Search the next line of those methods with a variable assignment that contains a cast to this.x.x();
 * 4. The isaac cipher field name is the second x.
 */
public class IsaacCipherFieldName implements PatternSearcher {
    private static final String CLASS_PATTERN = "class\\s+(\\w+)\\s*\\{";
    private static final String PUBLIC_PROPERTY_PATTERN = "public\\s+(\\w+)\\s+(\\w+);";

    private static final String WHILE_TRUE_PATTERN = "while\\s*\\(true\\s*\\)\\s*\\{";

    private static final String CAST_PATTERN = "\\(\\w+\\)\\s*this\\.\\w+\\.\\w+\\(\\)";

    private final Pattern classPattern;
    private final Pattern publicPropertyPattern;
    private final Pattern whileTruePattern;
    private final Pattern castPattern;

    private String isaacCipherFieldName = "Unknown";

    public IsaacCipherFieldName() {
        this.classPattern = Pattern.compile(CLASS_PATTERN);
        this.publicPropertyPattern = Pattern.compile(PUBLIC_PROPERTY_PATTERN);
        this.whileTruePattern = Pattern.compile(WHILE_TRUE_PATTERN);
        this.castPattern = Pattern.compile(CAST_PATTERN);
    }

    @Override
    public boolean matches(File file, String content) {
        Matcher classMatcher = classPattern.matcher(content);
        if (classMatcher.find()) {
            Matcher publicPropertyMatcher = publicPropertyPattern.matcher(content);
            int publicPropertyCount = 0;
            while (publicPropertyMatcher.find()) {
                publicPropertyCount++;
                isaacCipherFieldName = publicPropertyMatcher.group(2);
            }

            if (publicPropertyCount == 1) {
                Matcher whileMatcher = whileTruePattern.matcher(content);
                while (whileMatcher.find()) {
                    int start = whileMatcher.end();
                    String methodCode = content.substring(start);
                    Matcher castMatcher = castPattern.matcher(methodCode);
                    if (castMatcher.find()) {
                        String castLine = castMatcher.group(0);

                        String castFieldName = extractSecondField(castLine);
                        if (castFieldName != null) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    @Override
    public String getObfuscatedName() {
        return isaacCipherFieldName;
    }

    @Override
    public String getDescription() {
        return "isaacCipherFieldName";
    }

    private String extractSecondField(String line) {
        Pattern fieldPattern = Pattern.compile("this\\.(\\w+)\\.(\\w+)");
        Matcher matcher = fieldPattern.matcher(line);
        if (matcher.find()) {
            return matcher.group(2);
        }
        return null;
    }
}
