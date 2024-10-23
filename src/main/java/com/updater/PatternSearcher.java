package com.updater;

import java.io.File;

public interface PatternSearcher {
    boolean matches(File file, String content, SearchContext context);

    String getObfuscatedName();

    String getDescription();
}
