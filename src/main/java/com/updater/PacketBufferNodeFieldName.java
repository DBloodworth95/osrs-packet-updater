package com.updater;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/*
 * Steps to find are as follows:
 * 1. Search for a class which instantiates an array of itself with a size of 300.
 * 2. This class should also extend something.
 * 3. Search for methods which have 3 or more else if blocks.
 * 4. Those else if's will be trying to assign the same variable, e.g: var2.x = new y(20);
 * 5. Extract x.
 */
public class PacketBufferNodeFieldName implements PatternSearcher {
    private String packetBufferFieldName = "Unknown";
    private String packetBufferNodeClassName = null;
    private final List<String> publicObjectFields = new ArrayList<>();

    @Override
    public boolean matches(File file, String content) {
        try {
            List<String> lines = Files.readAllLines(file.toPath());
            String currentClassName = null;
            boolean classFound = false;
            boolean inMethod = false;
            int elseIfCount = 0;
            int openBracesCount = 0;

            for (String line : lines) {
                line = line.trim();
                if (line.startsWith("public class") && line.contains("extends")) {
                    String[] parts = line.split("\\s+");
                    if (parts.length >= 3) {
                        currentClassName = parts[2];
                    }
                }

                if (currentClassName != null && line.contains("new " + currentClassName + "[300]")) {
                    packetBufferNodeClassName = currentClassName;
                    classFound = true;
                    break;
                }
            }

            if (!classFound) {
                return false;
            }

            for (String line : lines) {
                line = line.trim();

                if (line.startsWith("public") && !line.contains("static") && !line.contains("final") && line.contains(";")) {
                    String[] parts = line.split("\\s+");
                    if (parts.length >= 3 && !isPrimitive(parts[1]) && !parts[1].equals(packetBufferNodeClassName)) {
                        publicObjectFields.add(parts[2].replace(";", ""));  // Store public object field
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
