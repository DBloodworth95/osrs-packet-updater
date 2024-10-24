package com.updater.methods;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;

/*
 * Steps to find are as follows:
 * 1. Search for a class which contains a method with the following sig:
 * (int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9, int var10).
 * 2. Once found, check that method for a try block which follows up with a variable being assigned as null on the next line.
 * 3. Extract the method name.
 */
public class DoActionMethodName implements PatternSearcher {
    private String doActionMethodName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        String[] lines = content.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            if (line.contains("(int") && line.contains("String")) {
                if (isDoActionMethodSignature(line)) {
                    if (checkForTryAndNull(lines, i + 1)) {
                        doActionMethodName = extractMethodName(line);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String getObfuscatedName() {
        return doActionMethodName;
    }

    @Override
    public String getDescription() {
        return "DoActionMethodName";
    }

    private String extractMethodName(String line) {
        int indexOfParen = line.indexOf('(');
        if (indexOfParen > 0) {
            String[] parts = line.substring(0, indexOfParen).split("\\s+");
            return parts[parts.length - 1];
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
