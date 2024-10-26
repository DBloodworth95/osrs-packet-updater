package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;
import com.updater.search.SearchQuery;
import com.updater.search.SearchResult;

import java.io.File;

/*
 * Steps to find are as follows:
 * 1. Simply search for a class which instantiates an object with a property value of 260.
 * 2. And search for a class which instantiates an object with a property value of 100.
 * 3. And search for a class which instantiates an object with a property value of 10000.
 * NOTE: These values don't seem to change between revs.
 */
public class ClassContainingGetPacketBufferNodeName implements PatternSearcher {
    private static final String PATTERN_260 = "\\(260\\);";
    private static final String PATTERN_100 = "\\(100\\);";
    private static final String PATTERN_10000 = "\\(10000\\);";

    private String obfuscatedClassName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        SearchQuery query = new SearchQuery(content)
                .requireCount(PATTERN_260, 2)
                .requireCount(PATTERN_100, 1)
                .requireCount(PATTERN_10000, 1)
                .fromClass();

        SearchResult result = query.execute();
        if (result.meetsRequirements()) {
            obfuscatedClassName = result.getResult();
        }

        return !obfuscatedClassName.equals("Unknown");
    }

    @Override
    public String getObfuscatedName() {
        return obfuscatedClassName;
    }

    @Override
    public String getDescription() {
        return "classContainingGetPacketBufferNodeName";
    }
}
