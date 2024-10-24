package com.updater;

import com.updater.classes.*;
import com.updater.fields.*;
import com.updater.methods.AddNodeMethodName;
import com.updater.methods.DoActionMethodName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObfuscatedNameUpdater {
    private static final List<PatternSearcher> patternSearchers = new ArrayList<>();
    private static final Map<PatternSearcher, String> searcherResults = new HashMap<>();
    private static final SearchContext context = new SearchContext();

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ObfuscatedNameUpdater <directory>");
            System.exit(1);
        }

        registerClassSearchers();
        registerMethodSearchers();
        registerFieldSearchers();

        File dir = new File(args[0]);
        if (!dir.isDirectory()) {
            System.out.println("The provided path is not a directory.");
            System.exit(1);
        }

        for (PatternSearcher searcher : patternSearchers) {
            searcherResults.put(searcher, "Not Found");
        }

        searchDirectory(dir);

        for (Map.Entry<PatternSearcher, String> entry : searcherResults.entrySet()) {
            if (entry.getValue().equals("Not Found")) {
                System.out.println("Failed to find obfuscated name for: " + entry.getKey().getDescription());
            } else {
                System.out.println("Found obfuscated name/value: " + entry.getValue() + " for ObfuscatedName: " + entry.getKey().getDescription());
            }
        }
    }

    private static void registerClassSearchers() {
        patternSearchers.add(new MouseHandlerLastPressedTimeMillisClass());
        patternSearchers.add(new ClientPacketClassName());
        patternSearchers.add(new PacketBufferNodeClassName());
        patternSearchers.add(new ClassContainingGetPacketBufferNodeName());
        patternSearchers.add(new PacketWriterClassName());
        patternSearchers.add(new DoActionClassName());
    }

    private static void registerMethodSearchers() {
        patternSearchers.add(new AddNodeMethodName());
        patternSearchers.add(new DoActionMethodName());
    }

    private static void registerFieldSearchers() {
        patternSearchers.add(new PacketWriterFieldName());
        patternSearchers.add(new MouseHandlerLastPressedTimeMillisField());
        patternSearchers.add(new MouseHandlerMillisMultiplier());
        patternSearchers.add(new ClientMillisMultiplier());
        patternSearchers.add(new ClientMillisField());
        patternSearchers.add(new IsaacCipherFieldName());
        patternSearchers.add(new PacketBufferNodeFieldName());
        patternSearchers.add(new EventMouseClickObfuscatedName());
        patternSearchers.add(new BufferOffsetField());
    }

    private static void searchDirectory(File dir) {
        File[] files = dir.listFiles((d, name) -> name.endsWith(".java"));
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try {
                        searchInFile(file);
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + file.getName());
                        e.printStackTrace();
                    }
                }
            }
        }

        File[] subDirs = dir.listFiles(File::isDirectory);
        if (subDirs != null) {
            for (File subDir : subDirs) {
                searchDirectory(subDir);
            }
        }
    }

    private static void searchInFile(File file) throws IOException {
        String content = readFile(file);
        for (PatternSearcher searcher : patternSearchers) {
            if (searcherResults.get(searcher).equals("Not Found")) {
                if (searcher.matches(file, content, context)) {
                    searcherResults.put(searcher, searcher.getObfuscatedName());
                    context.addResolvedName(searcher.getDescription(), searcher.getObfuscatedName());
                }
            }
        }
    }

    private static String readFile(File file) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        }
        return contentBuilder.toString();
    }
}
