package com.updater.values;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Look in client.java for a if statement which checks if a variable is > 32767L.
 * 2. There will be a equation above it with 2 long fields.
 * 3. We want the long value that is first in the equation.
 * 4. Alternatively it's the value that's multiplied by MouseHandler_lastPressedTimeMillisClass.MouseHandler_lastPressedTimeMillisField
 */
public class MouseHandlerMillisMultiplier implements PatternSearcher {
    private static final String IF_STATEMENT_PATTERN = "if\\s*\\(\\s*\\w+\\s*>\\s*32767L\\s*\\)";
    private static final String LONG_ASSIGNMENT_PATTERN = "^\\s*long\\s+\\w+\\s*=.*L.*;";

    private final Pattern ifPattern;
    private final Pattern longAssignmentPattern;
    private String mouseHandlerMillisMultiplier = "Unknown";

    public MouseHandlerMillisMultiplier() {
        this.ifPattern = Pattern.compile(IF_STATEMENT_PATTERN);
        this.longAssignmentPattern = Pattern.compile(LONG_ASSIGNMENT_PATTERN, Pattern.MULTILINE);
    }

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        Matcher ifMatcher = ifPattern.matcher(content);
        while (ifMatcher.find()) {
            int ifStatementIndex = ifMatcher.start();
            String contentBeforeIf = getPreviousLines(content, ifStatementIndex);
            Matcher longMatcher = longAssignmentPattern.matcher(contentBeforeIf);
            if (longMatcher.find()) {
                String longAssignmentLine = longMatcher.group(0);
                String[] longValues = extractLongValues(longAssignmentLine);
                if (longValues.length == 2) {
                    mouseHandlerMillisMultiplier = longValues[0];
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
        return mouseHandlerMillisMultiplier;
    }

    @Override
    public String getDescription() {
        return "mouseHandlerMillisMultiplier";
    }

    private String[] extractLongValues(String longAssignmentLine) {
        Pattern longValuePattern = Pattern.compile("-?\\d+L");
        Matcher matcher = longValuePattern.matcher(longAssignmentLine);
        String[] longValues = new String[2];
        int index = 0;
        while (matcher.find() && index < 2) {
            longValues[index] = matcher.group(0).replace("L", "");
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
