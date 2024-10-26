package com.updater.search;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchResult {
    private final List<String> matches;
    private final SearchQuery.SearchType searchType;
    private final boolean meetsRequirements;

    public SearchResult(List<String> matches, SearchQuery.SearchType searchType, boolean meetsRequirements) {
        this.matches = matches;
        this.searchType = searchType;
        this.meetsRequirements = meetsRequirements;
    }

    public String getResult() {
        if (!meetsRequirements) {
            return "Unknown";
        }

        switch (searchType) {
            case CLASS:
                return extractClassName();
            case METHOD:
                return extractMethodName();
            case FIELD:
                return extractFieldName();
            case VALUE:
                return extractValue();
            default:
                throw new IllegalStateException("Unexpected SearchType: " + searchType);
        }
    }

    private String extractClassName() {
        return matches.stream()
                .map(this::parseClassName)
                .findFirst()
                .orElse("Unknown");
    }

    private String extractMethodName() {
        return matches.stream()
                .map(this::parseMethodName)
                .findFirst()
                .orElse("Unknown");
    }

    private String extractFieldName() {
        return matches.stream()
                .map(this::parseFieldName)
                .findFirst()
                .orElse("Unknown");
    }

    private String extractValue() {
        return matches.isEmpty() ? "Unknown" : matches.get(0);
    }

    private String parseClassName(String classBlock) {
        Matcher matcher = Pattern.compile("class\\s+(\\w+)").matcher(classBlock);
        return matcher.find() ? matcher.group(1) : "Unknown";
    }

    private String parseMethodName(String text) {
        Matcher matcher = Pattern.compile("void\\s+(\\w+)\\s*\\(").matcher(text);
        return matcher.find() ? matcher.group(1) : "Unknown";
    }

    private String parseFieldName(String text) {
        Matcher matcher = Pattern.compile("(\\w+)\\s*=\\s*").matcher(text);
        return matcher.find() ? matcher.group(1) : "Unknown";
    }

    public boolean meetsRequirements() {
        return meetsRequirements;
    }
}
