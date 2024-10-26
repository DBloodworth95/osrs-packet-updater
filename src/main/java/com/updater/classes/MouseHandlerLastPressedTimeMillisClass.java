package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;
import com.updater.search.SearchQuery;
import com.updater.search.SearchResult;

import java.io.File;

/*
 * Steps to find are as follows:
 * 1. Look for a class which implements MouseListener, MouseMotionListener & FocusListener.
 */
public class MouseHandlerLastPressedTimeMillisClass implements PatternSearcher {
    private String obfuscatedClassName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        SearchQuery query = new SearchQuery(content)
                .implementsInterfaces("MouseListener", "MouseMotionListener", "FocusListener")
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
        return "MouseHandler_lastPressedTimeMillisClass";
    }
}
