package com.updater.values;

import com.updater.PatternSearcher;
import com.updater.SearchContext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Steps to find are as follows:
 * 1. Search for client.java.
 * 2. Look for usages of getPacketBufferNodeMethodName.
 * 3. Identify calls to this field that call another method.
 * 4. Ensure the method has 3 arguments.
 * 5. Extract the value of the last argument.
 */
public class GetPacketBufferNodeGarbageValue implements PatternSearcher {
    private String getPacketBufferNodeGarbageValue = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        if (!file.getName().equals("client.java")) {
            return false;
        }

        String getPacketBufferNodeMethodName = context.getResolvedName("classContainingGetPacketBufferNodeName");
        if (getPacketBufferNodeMethodName == null || getPacketBufferNodeMethodName.equals("unknown")) {
            return false;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.contains(getPacketBufferNodeMethodName + ".")) {
                    if (isThreeArgMethodCall(line, getPacketBufferNodeMethodName)) {
                        String lastArgument = extractLastArgumentFromInnerCall(line);
                        if (lastArgument != null) {
                            getPacketBufferNodeGarbageValue = lastArgument;
                            return true;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public String getObfuscatedName() {
        return getPacketBufferNodeGarbageValue;
    }

    @Override
    public String getDescription() {
        return "getPacketBufferNodeGarbageValue";
    }

    private boolean isThreeArgMethodCall(String line, String methodName) {
        int methodCallStart = line.indexOf(methodName + ".");
        if (methodCallStart == -1) {
            return false;
        }

        String methodCall = line.substring(methodCallStart);
        int openParenIndex = methodCall.indexOf('(');
        int closeParenIndex = methodCall.indexOf(')', openParenIndex);
        if (openParenIndex == -1 || closeParenIndex == -1) {
            return false;
        }

        String[] args = methodCall.substring(openParenIndex + 1, closeParenIndex).split(",");

        return args.length == 3;
    }

    private String extractLastArgumentFromInnerCall(String line) {
        Pattern innerCallPattern = Pattern.compile("(\\w+)\\s*\\(([^()]*\\(.*?\\)[^()]*)\\)");
        Matcher matcher = innerCallPattern.matcher(line);
        String lastArg = null;
        while (matcher.find()) {
            String args = matcher.group(2);
            String[] argList = args.split(",");

            if (argList.length > 0) {
                lastArg = argList[argList.length - 1].trim();
                lastArg = lastArg.replaceAll("^\\(.*?\\)\\s*", "").trim();
                lastArg = lastArg.replaceAll("[()]", "").trim();
            }
        }

        return lastArg;
    }

}
