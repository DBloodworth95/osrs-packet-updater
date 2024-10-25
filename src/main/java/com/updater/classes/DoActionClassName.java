package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;

/*
 * Steps to find are as follows:
 * 1. Search for a class which contains a method with the following sig:
 * (int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9, int var10).
 * 2. Once found, check that method for a try block which follows up with a variable being assigned as null on the next line.
 * 3. Extract the class name for this method.
 */
public class DoActionClassName implements PatternSearcher {
    private String doActionClassName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        String[] lines = content.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            if (line.contains("(int") && line.contains("String")) {
                if (isDoActionMethodSignature(line)) {
                    if (checkForTryAndNull(lines, i + 1)) {
                        doActionClassName = findClassName(lines, i);

                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public String getObfuscatedName() {
        return doActionClassName;
    }

    @Override
    public String getDescription() {
        return "DoActionClassName";
    }

    private String findClassName(String[] lines, int methodIndex) {
        for (int i = methodIndex; i >= 0; i--) {
            String line = lines[i].trim();
            if (line.contains("class ")) {
                return extractClassName(line);
            }
        }

        return "Unknown";
    }

    private String extractClassName(String line) {
        int classIndex = line.indexOf("class");
        if (classIndex != -1) {
            String[] parts = line.substring(classIndex).split("\\s+");
            if (parts.length > 1) {
                return parts[1];
            }
        }

        return "Unknown";
    }


    private boolean isDoActionMethodSignature(String line) {
        return line.contains("(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9, int var10)");
    }

    private boolean checkForTryAndNull(String[] lines, int startIndex) {
        for (int i = startIndex; i < lines.length && i < startIndex + 5; i++) {
            String line = lines[i].trim();
            if (line.startsWith("try {")) {
                for (int j = i + 1; j < lines.length && j < i + 5; j++) {
                    if (lines[j].trim().contains("= null;")) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
