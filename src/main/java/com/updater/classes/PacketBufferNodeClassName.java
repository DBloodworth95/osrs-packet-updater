package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;
import com.updater.search.SearchQuery;
import com.updater.search.SearchResult;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Search for a class which instantiates an array of itself with a size of 300.
 * 2. This class should also extend something.
 */
public class PacketBufferNodeClassName implements PatternSearcher {
    private String packetBufferNodeClassName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        String className = extractClassName(content);
        SearchQuery query = new SearchQuery(content)
                .extendsAnyClass()
                .withPropertyAssignmentPattern("new " + className + "\\[300\\]")
                .fromClass();

        SearchResult result = query.execute();
        if (result.meetsRequirements()) {
            packetBufferNodeClassName = result.getResult();
            return true;
        }

        return false;
    }

    private String extractClassName(String content) {
        Matcher matcher = Pattern.compile("\\bclass\\s+(\\w+)").matcher(content);
        return matcher.find() ? matcher.group(1) : "Unknown";
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
