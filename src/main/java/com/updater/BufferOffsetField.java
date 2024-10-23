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
 * 5. Extract x, this is the PacketBufferNodeFieldName.
 * 6. Once PacketBufferNodeFieldName is found, look back to the class properties to find its type.
 * 7. Find what the type extends.
 * 8. Once found, check that class it should have a int property that isn't static or final and isn't instantiated
 */
public class BufferOffsetField implements PatternSearcher {
    private String bufferOffsetFieldName = "Unknown";
    private String bufferOffsetClassName = null;
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
                    bufferOffsetClassName = currentClassName;
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
                    if (parts.length >= 3 && !isPrimitive(parts[1]) && !parts[1].equals(bufferOffsetClassName)) {
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
                                String bufferOffsetFieldType = findFieldType(lines, field);
                                String extendedClassName = findExtendedClass(file.getParentFile(), bufferOffsetFieldType);
                                if (extendedClassName != null) {
                                    String intProperty = findIntProperty(file.getParentFile(), extendedClassName);
                                    if (intProperty != null) {
                                        bufferOffsetFieldName = intProperty;
                                    }
                                }
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
        return bufferOffsetFieldName;
    }

    @Override
    public String getDescription() {
        return "BufferOffsetField";
    }

    private String findFieldType(List<String> lines, String fieldName) {
        for (String line : lines) {
            line = line.trim();
            if (line.startsWith("public") || line.startsWith("private") || line.startsWith("protected")) {
                String[] parts = line.split("\\s+");
                if (parts[parts.length - 1].equals(fieldName + ";")) {
                    return parts[1];
                }
            }
        }
        return "Unknown";
    }

    private String findExtendedClass(File directory, String className) {
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                String result = findExtendedClass(file, className);
                if (result != null) {
                    return result;
                }
            } else if (file.getName().endsWith(".java")) {
                try {
                    List<String> lines = Files.readAllLines(file.toPath());
                    for (String line : lines) {
                        line = line.trim();
                        if (line.contains("class " + className)) {
                            if (line.contains("extends")) {
                                String[] parts = line.split("extends");
                                if (parts.length > 1) {
                                    return parts[1].trim().split("\\s+")[0];
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    private String findIntProperty(File directory, String className) {
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                String result = findIntProperty(file, className);
                if (result != null) {
                    return result;
                }
            } else if (file.getName().endsWith(".java")) {
                try {
                    List<String> lines = Files.readAllLines(file.toPath());
                    boolean isInClass = false;
                    for (String line : lines) {
                        line = line.trim();
                        if (line.startsWith("public class " + className) || line.startsWith("private class " + className) || line.startsWith("protected class " + className)) {
                            isInClass = true;
                        } else if (isInClass && line.startsWith("public") && line.contains("int") && !line.contains("static") && !line.contains("final") && line.contains(";")) {
                            String[] parts = line.split("\\s+");
                            return parts[parts.length - 1].replace(";", "");
                        } else if (isInClass && line.contains("}") && line.contains(className)) {
                            isInClass = false;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
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
