package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/*
 * Steps to find are as follows:
 * 1. Search for a class which instantiates an array of itself with a size of 300.
 * 2. This class should also extend something.
 */
public class PacketBufferNodeClassName implements PatternSearcher {
    private String packetBufferNodeClassName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        try {
            List<String> lines = Files.readAllLines(file.toPath());
            String currentClassName = null;

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
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String getObfuscatedName() {
        return packetBufferNodeClassName;
    }

    @Override
    public String getDescription() {
        return "packetBufferNodeClassName";
    }
}
