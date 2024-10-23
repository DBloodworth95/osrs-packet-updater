package com.updater;

import java.util.HashMap;
import java.util.Map;

public class SearchContext {
    private final Map<String, String> resolvedNames = new HashMap<>();

    public String getResolvedName(String key) {
        return resolvedNames.getOrDefault(key, "Unknown");
    }

    public void addResolvedName(String key, String obfuscatedName) {
        resolvedNames.put(key, obfuscatedName);
    }
}
