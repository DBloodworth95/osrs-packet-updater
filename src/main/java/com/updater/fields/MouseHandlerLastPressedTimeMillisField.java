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
 * 1. Look for a class which implements MouseListener, MouseMotionListener & FocusListener. This is the MouseHandlerLastPressedTimeMillis class.
 * 2. Look for fields in the class which are a public static long with an initialized value of 0L
 * 3. There should be 2, the field we want is the one that gets assigned last in methods where it is assigned.
 */
public class MouseHandlerLastPressedTimeMillisField implements PatternSearcher {
    private String lastAssignedField = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        try {
            List<String> lines = Files.readAllLines(file.toPath());
            List<String> properties = new ArrayList<>();
            for (String line : lines) {
                line = line.trim();
                if (line.startsWith("public static long")) {
                    String[] parts = line.split(" ");
                    if (parts.length >= 6 && parts[5].contains("0L;")) {
                        properties.add(parts[3]);
                    }
                }
            }

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i).trim();
                if (line.startsWith("public") && line.contains("(") && line.contains(")")) {
                    String tempLastAssignedField = "Unknown";
                    for (int j = i + 1; j < lines.size(); j++) {
                        String assignmentLine = lines.get(j).trim();

                        if (assignmentLine.isEmpty() || assignmentLine.startsWith("public")) {
                            break;
                        }

                        for (String property : properties) {
                            if (assignmentLine.contains(property + " = ")) {
                                tempLastAssignedField = property;
                            }
                        }
                    }

                    if (!tempLastAssignedField.equals("Unknown")) {
                        lastAssignedField = tempLastAssignedField;
                    }
                }
            }

            return !lastAssignedField.equals("Unknown");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public String getObfuscatedName() {
        return lastAssignedField;
    }

    @Override
    public String getDescription() {
        return "MouseHandler_lastPressedTimeMillisField";
    }
}
