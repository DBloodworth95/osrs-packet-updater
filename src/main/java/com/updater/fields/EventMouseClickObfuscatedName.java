package com.updater.fields;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Search client.java for a if statement which checks if a variable is > 32767L
 * 2. Search for the first call to the classContainingGetPacketBufferNode after that if statement.
 * 3. The call will contain 3 args, the last arg being cast to a byte.
 * 4. We need extract the first argument and grab the field name.
 */
public class EventMouseClickObfuscatedName implements PatternSearcher {
    private static final String CLIENT_FILE = "client.java";

    private String classContainingGetPacketBufferNode;
    private String extractedFieldName;

    public EventMouseClickObfuscatedName() {
        this.classContainingGetPacketBufferNode = "Unknown";
        this.extractedFieldName = "Unknown";
    }

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        classContainingGetPacketBufferNode = context.getResolvedName("classContainingGetPacketBufferNodeName");
        try {
            File clientFile = findClientFile(file.getParentFile());
            if (clientFile != null) {
                String clientContent = new String(Files.readAllBytes(clientFile.toPath()));
                if (searchClientForCondition(clientContent)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    private File findClientFile(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().equals(CLIENT_FILE)) {
                    return file;
                } else if (file.isDirectory()) {
                    File found = findClientFile(file);
                    if (found != null) {
                        return found;
                    }
                }
            }
        }
        return null;
    }

    private boolean searchClientForCondition(String content) {
        List<String> lines = List.of(content.split("\n"));
        boolean foundCondition = false;

        for (String line : lines) {
            line = line.trim();

            if (line.startsWith("if") && line.contains("> 32767L")) {
                foundCondition = true;
                continue;
            }

            if (foundCondition && line.contains(classContainingGetPacketBufferNode)) {
                String argument = extractFirstArgument(line);
                if (argument != null) {
                    extractedFieldName = argument;
                    return true;
                }
            }
        }

        return false;
    }

    private String extractFirstArgument(String line) {
        int start = line.indexOf('(');
        int end = line.indexOf(')', start);

        if (start != -1 && end != -1) {
            String arguments = line.substring(start + 1, end).trim();
            String[] args = arguments.split(",");

            if (args.length > 0) {
                String firstArgument = args[0].trim();
                if (firstArgument.contains(".")) {
                    return firstArgument.substring(firstArgument.lastIndexOf('.') + 1);
                }
                return firstArgument;
            }
        }
        return null;
    }

    @Override
    public String getObfuscatedName() {
        return extractedFieldName;
    }

    @Override
    public String getDescription() {
        return "EventMouseClickObfuscatedName";
    }
}
