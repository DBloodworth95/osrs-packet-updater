package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Search for a class which instantiates an object with a property value of 5000.
 * 2. Search for a class which instantiates an object with a property value of 40000.
 * 3. If required in the future to be more specific, we can look for a ctor which contains a try block with a super(); call.
 */
public class PacketWriterClassName implements PatternSearcher {
    private static final String CLASS_PATTERN = "class\\s+(\\w+)\\s*\\{";

    private static final String INSTANTIATION_5000 = "new\\s+\\w+\\(5000\\);";
    private static final String INSTANTIATION_40000 = "new\\s+\\w+\\(40000\\);";

    private final Pattern classPattern;
    private final Pattern instantiation5000Pattern;
    private final Pattern instantiation40000Pattern;

    private String packetWriterClassName = "Unknown";

    public PacketWriterClassName() {
        this.classPattern = Pattern.compile(CLASS_PATTERN);
        this.instantiation5000Pattern = Pattern.compile(INSTANTIATION_5000);
        this.instantiation40000Pattern = Pattern.compile(INSTANTIATION_40000);
    }

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        Matcher classMatcher = classPattern.matcher(content);
        Matcher instantiation5000Matcher = instantiation5000Pattern.matcher(content);
        Matcher instantiation40000Matcher = instantiation40000Pattern.matcher(content);

        if (classMatcher.find() && instantiation5000Matcher.find() && instantiation40000Matcher.find()) {
            packetWriterClassName = classMatcher.group(1);
            return true;
        }
        return false;
    }

    @Override
    public String getObfuscatedName() {
        return packetWriterClassName;
    }

    @Override
    public String getDescription() {
        return "packetWriterClassName";
    }
}
