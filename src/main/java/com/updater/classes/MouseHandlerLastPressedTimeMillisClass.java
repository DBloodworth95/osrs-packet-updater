package com.updater.classes;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Look for a class which implements MouseListener, MouseMotionListener & FocusListener.
 */
public class MouseHandlerLastPressedTimeMillisClass implements PatternSearcher {

    private static final String CLASS_PATTERN = "class\\s+\\w+\\s+implements\\s+MouseListener,\\s*MouseMotionListener,\\s*FocusListener";
    private final Pattern classPattern;

    private String obfuscatedClassName = "Unknown";

    public MouseHandlerLastPressedTimeMillisClass() {
        this.classPattern = Pattern.compile(CLASS_PATTERN);
    }

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        Matcher matcher = classPattern.matcher(content);
        if (matcher.find()) {
            obfuscatedClassName = extractClassName(content);
            return true;
        }
        return false;
    }

    private String extractClassName(String content) {
        Pattern classPattern = Pattern.compile("class\\s+(\\w+)");
        Matcher matcher = classPattern.matcher(content);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "Unknown";
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
