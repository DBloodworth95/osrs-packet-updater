package com.updater.fields;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Pass in the packet writer class name from a previous search.
 * 2. Look for a field with that type.
 * 3. This field lives in client.java.
 * 4. It's typically the only class level field which is declared as a public static final.
 * 5. Failing that, it will be the only class level field in client.java which is of the packet write class type.
 */
public class PacketWriterFieldName implements PatternSearcher {
    private String packetWriterFieldName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        String packetWriterClassName = context.getResolvedName("packetWriterClassName");
        if (packetWriterClassName.equalsIgnoreCase("unknown") || packetWriterClassName.equalsIgnoreCase("not found")) {
            return false;
        }

        Pattern fieldPattern = getPacketWriterFieldPattern(packetWriterClassName);
        Matcher matcher = fieldPattern.matcher(content);
        if (matcher.find()) {
            packetWriterFieldName = matcher.group(1);
            return true;
        }

        return false;
    }

    @Override
    public String getObfuscatedName() {
        return packetWriterFieldName;
    }

    @Override
    public String getDescription() {
        return "packetWriterFieldName";
    }

    private Pattern getPacketWriterFieldPattern(String packetWriterClassName) {
        return Pattern.compile("\\b" + packetWriterClassName + "\\s+(\\w+);");
    }
}
