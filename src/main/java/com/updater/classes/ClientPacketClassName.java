package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;
import com.updater.search.SearchQuery;
import com.updater.search.SearchResult;

import java.io.File;

/*
 * Steps to find are as follows:
 * 1. Search for a class which implements an interface.
 * 2. Search for a class which declares 20 or more public static final fields which instantiate an object.
 */
public class ClientPacketClassName implements PatternSearcher {
    private String obfuscatedClassName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        SearchQuery query = new SearchQuery(content)
                .implementingAnyInterface()
                .withPropertyDeclarations("public static final", 20)
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
        return "clientPacketClassName";
    }
}
