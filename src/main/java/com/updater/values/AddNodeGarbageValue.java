package com.updater.values;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Search for client.java.
 * 2. Look for the packetWriterClassName type declared at class level.
 * 3. Find the name of the property.
 * 4. Search for usages of that variable with addNodeMethodName and capture the last argument value.
 */
public class AddNodeGarbageValue implements PatternSearcher {
    private String addNodeGarbageValue = "Unknown";

    private static final String PACKET_WRITER_PATTERN = "%s\\s+(\\w+);"; // e.g., `packetWriterClassName varName;`
    private static final String METHOD_USAGE_PATTERN = "%s\\.%s\\((.*)\\)"; // e.g., `varName.addNodeMethodName(...)`

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        if (!file.getName().equals("client.java")) {
            return false;
        }

        String packetWriterClassName = context.getResolvedName("packetWriterClassName");
        String addNodeMethodName = context.getResolvedName("addNodeMethodName");
        if (packetWriterClassName == null || addNodeMethodName == null ||
                packetWriterClassName.equals("unknown") || addNodeMethodName.equals("unknown")) {
            return false;
        }

        Pattern packetWriterPattern = Pattern.compile(String.format(PACKET_WRITER_PATTERN, packetWriterClassName));
        Matcher packetWriterMatcher = packetWriterPattern.matcher(content);
        String propertyName = null;
        if (packetWriterMatcher.find()) {
            propertyName = packetWriterMatcher.group(1);
        }

        if (propertyName == null) {
            return false;
        }

        Pattern methodUsagePattern = Pattern.compile(String.format(METHOD_USAGE_PATTERN, propertyName, addNodeMethodName));
        Matcher methodUsageMatcher = methodUsagePattern.matcher(content);

        while (methodUsageMatcher.find()) {
            String arguments = methodUsageMatcher.group(1);
            Pattern lastArgumentPattern = Pattern.compile("(-?\\d+)\\s*\\)?\\s*$");
            Matcher lastArgumentMatcher = lastArgumentPattern.matcher(arguments);
            if (lastArgumentMatcher.find()) {
                addNodeGarbageValue = lastArgumentMatcher.group(1);

                return true;
            }
        }

        return false;
    }

    @Override
    public String getObfuscatedName() {
        return addNodeGarbageValue;
    }

    @Override
    public String getDescription() {
        return "addNodeGarbageValue";
    }
}
