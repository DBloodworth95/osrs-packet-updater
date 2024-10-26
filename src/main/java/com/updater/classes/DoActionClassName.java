package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;
import com.updater.search.SearchQuery;
import com.updater.search.SearchResult;

import java.io.File;

/*
 * Steps to find are as follows:
 * 1. Search for a class which contains a method with the following sig:
 * (int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9, int var10).
 * 2. Once found, check that method for a try block which follows up with a variable being assigned as null on the next line.
 * 3. Extract the class name for this method.
 */
public class DoActionClassName implements PatternSearcher {
    private String doActionClassName = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        SearchQuery query = new SearchQuery(content)
                .withMethodSignature("\\(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9, int var10\\)")
                .withFollowingPattern("try \\{")
                .withFollowingPattern("= null;")
                .fromClass();

        SearchResult result = query.execute();
        if (result.meetsRequirements()) {
            doActionClassName = result.getResult();
        }

        return !doActionClassName.equals("Unknown");
    }

    @Override
    public String getObfuscatedName() {
        return doActionClassName;
    }

    @Override
    public String getDescription() {
        return "DoActionClassName";
    }
}
