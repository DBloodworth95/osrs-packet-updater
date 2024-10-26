package com.updater.search;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JavaFileStringSearcher {
    private final String content;

    public JavaFileStringSearcher(String directoryPath) {
        this.content = loadFilesAsSingleString(directoryPath);
    }

    public SearchQuery newQuery() {
        return new SearchQuery(content);
    }

    private String loadFilesAsSingleString(String directoryPath) {
        StringBuilder concatenatedFileContents = new StringBuilder();
        try (Stream<Path> paths = Files.walk(Paths.get(directoryPath))) {
            paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        try {
                            concatenatedFileContents.append(Files.readString(path))
                                    .append(System.lineSeparator());
                        } catch (IOException e) {
                            System.err.println("Failed to read file: " + path);
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            System.err.println("Failed to load files from directory: " + directoryPath);
            e.printStackTrace();
        }

        return concatenatedFileContents.toString();
    }
}
