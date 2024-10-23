package com.updater.fields;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/*
 * Steps to find are as follows:
 * 1. Search client.java for a if statement which checks if a variable is > 32767L
 * 2. Find the line of code that occurs before this, it should be a simple math equation.
 * 3. There will be 2 long values in this equation, we need the second one.
 * 4. Once we have the second one, we need to find the field that is multiplied by it.
 */
public class ClientMillisField implements PatternSearcher {
    private String clientMillisField = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        try {
            List<String> lines = Files.readAllLines(file.toPath());
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i).trim();
                if (isIfStatementWithCondition(line)) {
                    String longAssignment = findPreviousLongAssignment(lines, i);
                    if (longAssignment != null) {
                        clientMillisField = extractFieldFromSecondLongAssignment(longAssignment);
                        if (clientMillisField != null) {
                            return true;
                        }
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
        return clientMillisField;
    }

    @Override
    public String getDescription() {
        return "clientMillisField";
    }

    private boolean isIfStatementWithCondition(String line) {
        return line.startsWith("if") && line.contains("> 32767L");
    }

    private String findPreviousLongAssignment(List<String> lines, int currentIndex) {
        for (int i = currentIndex - 1; i >= 0; i--) {
            String line = lines.get(i).trim();
            if (line.startsWith("long ")) {
                return line;
            }
        }
        return null;
    }

    private String extractFieldFromSecondLongAssignment(String longAssignmentLine) {
        String[] tokens = longAssignmentLine.split("\\s+");
        int longValueCount = 0;
        String secondLongValue = null;

        for (String token : tokens) {
            String cleanedToken = token.replace(";", "");
            if (isLongValue(cleanedToken)) {
                longValueCount++;
                if (longValueCount == 2) {
                    secondLongValue = cleanedToken;
                    break;
                }
            }
        }

        if (secondLongValue != null) {
            int index = longAssignmentLine.indexOf(secondLongValue);
            if (index != -1) {
                String before = longAssignmentLine.substring(0, index).trim();
                String after = longAssignmentLine.substring(index + secondLongValue.length()).trim();

                if (before.endsWith("*")) {
                    String fieldBefore = before.substring(0, before.length() - 1).trim();
                    return extractVariableName(fieldBefore);
                }

                if (after.startsWith("*")) {
                    String fieldAfter = after.substring(1).trim();
                    return extractVariableName(fieldAfter);
                }
            }
        }

        return null;
    }

    private boolean isLongValue(String token) {
        return token.endsWith("L") && token.length() > 1 && token.substring(0, token.length() - 1).matches("-?\\d+");
    }

    private String extractVariableName(String expression) {
        String[] parts = expression.split("\\s+");
        return parts[parts.length - 1].replace(";", "").trim();
    }
}
