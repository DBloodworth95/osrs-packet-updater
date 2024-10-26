package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;
import com.updater.search.SearchQuery;
import com.updater.search.SearchResult;

import java.io.File;

/*
 * Steps to find are as follows:
 * 1. Search for a class which instantiates an object with a property value of 5000.
 * 2. Search for a class which instantiates an object with a property value of 40000.
 * 3. If required in the future to be more specific, we can look for a ctor which contains a try block with a super(); call.
 */
public class PacketWriterClassName implements PatternSearcher {
    private String packetWriterClassName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        SearchQuery query = new SearchQuery(content)
                .withObjectInstantiation("(\\w+)", 5000)
                .withObjectInstantiation("(\\w+)", 40000)
                .fromClass();

        SearchResult result = query.execute();

        if (result.meetsRequirements()) {
            packetWriterClassName = result.getResult();
            return true;
        }
        return false;
    }

    @Override
    public String getObfuscatedName() {
        return packetWriterClassName;
    }

    @Override
    public String getDescription() {
        return "packetWriterClassName";
    }
}
