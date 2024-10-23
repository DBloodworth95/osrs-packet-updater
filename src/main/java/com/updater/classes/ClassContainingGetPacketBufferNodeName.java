package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Simply search for a class which instantiates an object with a property value of 260.
 * 2. And search for a class which instantiates an object with a property value of 100.
 * 3. And search for a class which instantiates an object with a property value of 10000.
 * NOTE: These values don't seem to change between revs.
 */
public class ClassContainingGetPacketBufferNodeName implements PatternSearcher {

    private static final String PATTERN_260 = "\\(260\\);";
    private static final String PATTERN_100 = "\\(100\\);";
    private static final String PATTERN_10000 = "\\(10000\\);";

    private final Pattern pattern260;
    private final Pattern pattern100;
    private final Pattern pattern10000;

    private String obfuscatedClassName;

    public ClassContainingGetPacketBufferNodeName() {
        this.pattern260 = Pattern.compile(PATTERN_260);
        this.pattern100 = Pattern.compile(PATTERN_100);
        this.pattern10000 = Pattern.compile(PATTERN_10000);
        this.obfuscatedClassName = "Unknown";
    }

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        int count260 = countMatches(content, pattern260);
        int count100 = countMatches(content, pattern100);
        int count10000 = countMatches(content, pattern10000);

        if (count260 == 2 && count100 == 1 && count10000 == 1) {
            obfuscatedClassName = extractClassName(content);
            return true;
        }
        return false;
    }

    private int countMatches(String content, Pattern pattern) {
        Matcher matcher = pattern.matcher(content);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }


    private String extractClassName(String content) {
        Pattern classPattern = Pattern.compile("class\\s+(\\w+)");
        Matcher matcher = classPattern.matcher(content);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "Unknown";
    }

    @Override
    public String getObfuscatedName() {
        return obfuscatedClassName;
    }

    @Override
    public String getDescription() {
        return "classContainingGetPacketBufferNodeName";
    }
}
