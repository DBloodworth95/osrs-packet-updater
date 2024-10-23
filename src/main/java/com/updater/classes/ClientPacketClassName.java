package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Search for a class which implements an interface.
 * 2. Search for a class which declares 10 or more public static final fields which instantiate an object.
 */
public class ClientPacketClassName implements PatternSearcher {
    private static final String CLASS_PATTERN = "public\\s+class\\s+([a-zA-Z]+)\\s+implements\\s+[a-zA-Z]+\\s*\\{\\s*(public\\s+static\\s+final\\s+\\1\\s+\\w+\\s*=\\s*new\\s+\\1\\(\\d+,\\s*-?\\d+\\);\\s*){10}";
    private final Pattern classPattern;

    private String obfuscatedClassName = "Unknown";

    public ClientPacketClassName() {
        this.classPattern = Pattern.compile(CLASS_PATTERN);
    }

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        Matcher matcher = classPattern.matcher(content);
        if (matcher.find()) {
            obfuscatedClassName = matcher.group(1);
            return true;
        }
        return false;
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
