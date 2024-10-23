package com.updater;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Search client.java for a if statement which checks if a variable is > 32767L
 * 2. Find the line of code that occurs before this, it should be a simple math equation.
 * 3. There will be 2 long values in this equation, we need the second one.
 */
public class ClientMillisMultiplier implements PatternSearcher {
    private static final String IF_STATEMENT_PATTERN = "if\\s*\\(\\s*\\w+\\s*>\\s*32767L\\s*\\)";
    private static final String LONG_ASSIGNMENT_PATTERN = "^\\s*long\\s+\\w+\\s*=.*L.*;";

    private final Pattern ifPattern;
    private final Pattern longAssignmentPattern;
    private String clientMillisMultiplier = "Unknown";

    public ClientMillisMultiplier() {
        this.ifPattern = Pattern.compile(IF_STATEMENT_PATTERN);
        this.longAssignmentPattern = Pattern.compile(LONG_ASSIGNMENT_PATTERN, Pattern.MULTILINE);
    }

    @Override
    public boolean matches(File file, String content) {
        Matcher ifMatcher = ifPattern.matcher(content);
        while (ifMatcher.find()) {
            int ifStatementIndex = ifMatcher.start();
            String contentBeforeIf = getPreviousLines(content, ifStatementIndex);
            Matcher longMatcher = longAssignmentPattern.matcher(contentBeforeIf);
            if (longMatcher.find()) {
                String longAssignmentLine = longMatcher.group(0);
                String[] longValues = extractLongValues(longAssignmentLine);
                if (longValues.length == 2) {
                    clientMillisMultiplier = longValues[1];
                    return true;
                } else {
                    System.out.println("Could not extract two long values ending with 'L' from the assignment line!");
                }
            } else {
                System.out.println("No long assignment found before the if statement!");
            }
        }

        return false;
    }

    @Override
    public String getObfuscatedName() {
        return clientMillisMultiplier;
    }

    @Override
    public String getDescription() {
        return "clientMillisMultiplier";
    }

    private String[] extractLongValues(String longAssignmentLine) {
        Pattern longValuePattern = Pattern.compile("-?\\d+L");
        Matcher matcher = longValuePattern.matcher(longAssignmentLine);
        String[] longValues = new String[2];
        int index = 0;
        while (matcher.find() && index < 2) {
            longValues[index] = matcher.group(0).replace("L", "");  // Remove 'L'
            index++;
        }
        return longValues;
    }

    private String getPreviousLines(String content, int endIndex) {
        String[] lines = content.substring(0, endIndex).split("\\n");
        StringBuilder limitedContent = new StringBuilder();
        int startLine = Math.max(0, lines.length - 5);
        for (int i = startLine; i < lines.length; i++) {
            limitedContent.append(lines[i]).append("\n");
        }
        return limitedContent.toString();
    }
}
