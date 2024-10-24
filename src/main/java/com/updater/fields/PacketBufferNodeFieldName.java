package com.updater.fields;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/*
 * Steps to find are as follows:
 * 1. Grab the packet buffer node class name.
 * 2. Search for methods which have 3 or more else if blocks.
 * 3. Those else if's will be trying to assign the same variable, e.g: var2.x = new y(20);
 * 4. Extract x.
 */
public class PacketBufferNodeFieldName implements PatternSearcher {
    private String packetBufferFieldName = "Unknown";
    private final List<String> publicObjectFields = new ArrayList<>();

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        try {
            String packetBufferNodeClassName = context.getResolvedName("packetBufferNodeClassName");
            if (packetBufferNodeClassName.equalsIgnoreCase("unknown") || packetBufferNodeClassName.equalsIgnoreCase("not found")) {
                return false;
            }

            String packetBufferNodeFieldName = context.getResolvedName("packetBufferNodeFieldName");
            if (!packetBufferNodeFieldName.equalsIgnoreCase("unknown") && !packetBufferNodeFieldName.equalsIgnoreCase("not found")) {
                return true;
            }

            List<String> lines = Files.readAllLines(file.toPath());
            boolean inMethod = false;
            int elseIfCount = 0;
            int openBracesCount = 0;

            for (String line : lines) {
                line = line.trim();

                if (line.startsWith("public") && !line.contains("static") && !line.contains("final") && line.contains(";")) {
                    String[] parts = line.split("\\s+");
                    if (parts.length >= 3 && !isPrimitive(parts[1]) && !parts[1].equals(packetBufferNodeClassName)) {
                        publicObjectFields.add(parts[2].replace(";", ""));
                    }
                }

                if (line.startsWith("public static") && line.contains("(") && line.contains(")")) {
                    inMethod = true;
                    elseIfCount = 0;
                    openBracesCount = 0;
                }

                if (inMethod) {
                    openBracesCount += countOccurrences(line, '{');
                    openBracesCount -= countOccurrences(line, '}');

                    if (line.contains("else if")) {
                        elseIfCount++;
                    }

                    if (elseIfCount >= 3) {
                        for (String field : publicObjectFields) {
                            if (line.contains(field + " =")) {
                                packetBufferFieldName = field;
                                return true;
                            }
                        }
                    }

                    if (openBracesCount == 0) {
                        inMethod = false;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String getObfuscatedName() {
        return packetBufferFieldName;
    }

    @Override
    public String getDescription() {
        return "packetBufferNodeFieldName";
    }

    private int countOccurrences(String line, char ch) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrimitive(String type) {
        return type.equals("int") || type.equals("long") || type.equals("float") ||
                type.equals("double") || type.equals("boolean") || type.equals("char") || type.equals("byte") || type.equals("short");
    }
}
