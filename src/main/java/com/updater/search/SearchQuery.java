package com.updater.search;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SearchQuery {
    public enum SearchType { CLASS, METHOD, FIELD, VALUE }

    private List<String> contentBlocks;
    private final Map<Pattern, Integer> requiredCounts = new HashMap<>();
    private SearchType searchType = SearchType.CLASS;

    public SearchQuery(String content) {
        this.contentBlocks = List.of(content);
    }

    public SearchQuery withClass(String className) {
        String regex = "\\bclass\\s+" + (className.isEmpty() ? "\\w+" : Pattern.quote(className)) + "\\s*\\{";
        return filterBlocksByPattern(regex);
    }

    public SearchQuery implementingAnyInterface() {
        return filterBlocksByPattern("\\bclass\\s+\\w+\\s+implements\\s+\\w+");
    }

    public SearchQuery extendsAnyClass() {
        String regex = "\\bclass\\s+\\w+\\s*(\\s|\\n)*extends\\s+\\w+";
        return filterBlocksByPattern(regex);
    }

    public SearchQuery implementsInterfaces(String... interfaces) {
        String interfacePattern = String.join(",\\s*", interfaces);
        String regex = "class\\s+\\w+\\s+implements\\s+" + interfacePattern;
        return filterBlocksByPattern(regex);
    }

    public SearchQuery withPropertyDeclarations(String modifierPattern, int times) {
        String patternString = "(?m)^\\s*" + modifierPattern + "\\s+\\w+\\s+\\w+\\s*(=\\s*.*)?;";
        Pattern pattern = Pattern.compile(patternString);
        contentBlocks = contentBlocks.stream()
                .filter(block -> countPatternOccurrences(block, pattern) >= times)
                .collect(Collectors.toList());
        return this;
    }

    public SearchQuery withPropertyAssignmentPattern(String assignmentPattern) {
        Pattern assignmentPatternRegex = Pattern.compile("=\\s*" + assignmentPattern);
        contentBlocks = contentBlocks.stream()
                .map(this::retainClassWithPropertiesOutsideMethods)
                .filter(block -> assignmentPatternRegex.matcher(block).find())
                .collect(Collectors.toList());

        return this;
    }

    private String retainClassWithPropertiesOutsideMethods(String content) {
        StringBuilder classWithPropertiesOnly = new StringBuilder();
        Pattern methodStartPattern = Pattern.compile("\\b(public|protected|private|static|final).*\\s*\\(.*\\)\\s*\\{");
        Pattern propertyPattern = Pattern.compile("^(public|protected|private|static|final)\\s+.*;");
        boolean insideMethod = false;
        for (String line : content.split("\n")) {
            line = line.trim();

            if (methodStartPattern.matcher(line).find()) {
                insideMethod = true;
            }

            if (line.equals("}")) {
                insideMethod = false;
            }

            if (!insideMethod) {
                if (propertyPattern.matcher(line).find() || line.contains("class ")) {
                    classWithPropertiesOnly.append(line).append("\n");
                }
            }
        }

        return classWithPropertiesOnly.toString();
    }


    public SearchQuery withObjectInstantiation(String classNamePattern, Object... args) {
        String argsPattern = Arrays.stream(args)
                .map(this::getArgumentPattern)
                .collect(Collectors.joining("\\s*,\\s*"));

        Pattern instantiationPattern = Pattern.compile("new\\s+" + classNamePattern + "\\(" + argsPattern + "\\)");
        contentBlocks = contentBlocks.stream()
                .filter(block -> instantiationPattern.matcher(block).find())
                .collect(Collectors.toList());

        return this;
    }

    private String getArgumentPattern(Object arg) {
        if (arg instanceof Integer || arg instanceof Long || arg instanceof Short) {
            return String.valueOf(arg);
        } else if (arg instanceof Boolean) {
            return arg.toString();
        } else if (arg instanceof Double || arg instanceof Float) {
            return String.valueOf(arg).replace(".", "\\.");
        } else if (arg instanceof String) {
            return "\"" + Pattern.quote((String) arg) + "\"";
        } else {
            throw new IllegalArgumentException("Unsupported argument type: " + arg.getClass());
        }
    }

    public SearchQuery requireCount(String regex, int count) {
        Pattern pattern = Pattern.compile(regex);
        contentBlocks = contentBlocks.stream()
                .filter(block -> countPatternOccurrences(block, pattern) >= count)
                .collect(Collectors.toList());
        return this;
    }

    public SearchQuery withMethodSignature(String signature) {
        String methodRegex = "\\b" + signature + "\\s*\\{";
        return filterBlocksByPattern(methodRegex);
    }

    public SearchQuery withFollowingPattern(String followingPattern) {
        Pattern pattern = Pattern.compile(followingPattern);
        contentBlocks = contentBlocks.stream()
                .filter(block -> checkNextLineForPattern(block, pattern))
                .collect(Collectors.toList());
        return this;
    }

    public SearchQuery fromClass() {
        this.searchType = SearchType.CLASS;
        return this;
    }

    public SearchResult execute() {
        return new SearchResult(contentBlocks, searchType, !contentBlocks.isEmpty());
    }

    private SearchQuery filterBlocksByPattern(String regex) {
        Pattern pattern = Pattern.compile(regex);
        contentBlocks = contentBlocks.stream()
                .filter(block -> pattern.matcher(block).find())
                .collect(Collectors.toList());
        return this;
    }

    private int countPatternOccurrences(String block, Pattern pattern) {
        Matcher matcher = pattern.matcher(block);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    private boolean checkNextLineForPattern(String block, Pattern followingPattern) {
        String[] lines = block.split("\n");
        for (int i = 0; i < lines.length - 1; i++) {
            String nextLine = lines[i + 1].trim();
            if (followingPattern.matcher(nextLine).find()) {
                return true;
            }
        }
        return false;
    }

    public SearchType getSearchType() {
        return searchType;
    }
}
