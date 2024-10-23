package com.updater.methods;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/*
 * Steps to find are as follows:
 * 1. Find the packet writer class by searching for an object instantiation with a property value of 40000 (This seems to only happen once in the client and is unlikely to change).
 * 2. Once found, go through all the methods with a try/catch block.
 * 3. Once found, search the next line for a method call which matches this pattern "this.x.x(var1);", the name of this method is what we need.
 */
public class AddNodeMethodName implements PatternSearcher {
    private String addNodeMethodName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        try {
            List<String> lines = Files.readAllLines(file.toPath());
            String packetWriterClassName = findPacketWriterClassName(lines);

            if (packetWriterClassName != null) {
                String methodWithTryBlock = findMethodWithTryBlock(lines);

                if (methodWithTryBlock != null) {
                    addNodeMethodName = methodWithTryBlock;
                    return !addNodeMethodName.equals("Unknown");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public String getObfuscatedName() {
        return addNodeMethodName;
    }

    @Override
    public String getDescription() {
        return "addNodeMethodName";
    }

    private String findPacketWriterClassName(List<String> lines) {
        for (String line : lines) {
            line = line.trim();
            if (line.contains("class ") && line.contains("{")) {
                String className = line.split("\\s+")[2];

                for (String l : lines) {
                    if (l.contains("(40000);")) {
                        return className;
                    }
                }
            }
        }
        return null;
    }

    private String findMethodWithTryBlock(List<String> lines) {
        String methodName;

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i).trim();
            if (line.startsWith("public") && line.contains("(") && line.contains(")")) {
                methodName = extractMethodName(line);
                if (i + 1 < lines.size() && lines.get(i + 1).trim().startsWith("try")) {
                    if (i + 2 < lines.size() && lines.get(i + 2).contains("this.")) {
                        String nextLine = lines.get(i + 2).trim();
                        if (nextLine.contains("(var1);")) {
                            return methodName;
                        }
                    }
                }
            }
        }

        return null;
    }

    private String extractMethodName(String methodDeclaration) {
        String[] parts = methodDeclaration.split("\\s+");
        for (String part : parts) {
            if (part.contains("(")) {
                return part.substring(0, part.indexOf('('));
            }
        }
        return "Unknown";
    }
}
