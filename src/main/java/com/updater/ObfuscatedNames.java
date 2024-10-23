package com.updater;

public class ObfuscatedNames {
    /*
        For setting the client to be in Jagex Account mode or Legacy Account mode
     */
    public static final byte INDEX_GARBAGE = 1;
    public static final String INDEX_FIELD = "aa";
    public static final String INDEX_CLASS = "as";
    public static final String SESSION_FIELD = "gg";
    public static final String SESSION_CLASS = "kp";
    public static final String CHAR_FIELD = "gh";
    public static final String CHAR_CLASS = "ru";
    public static final String DISPLAY_FIELD = "cx";
    public static final String DISPLAY_CLASS = "dq";
    public static final String JX_ACCOUNT_CHECK_FIELD = "gp";
    public static final String JX_ACCOUNT_CHECK_CLASS = "client";
    public static final String JX_LEGACY_VALUE_FIELD = "ap";
    public static final String JX_LEGACY_VALUE_CLASS = "ve";

    public static final String EVENT_MOUSE_CLICK_WRITE1 = "mouseInfo";
    public static final String EVENT_MOUSE_CLICK_WRITE2 = "mouseX";
    public static final String EVENT_MOUSE_CLICK_WRITE3 = "mouseY";
    public static final String[][] EVENT_MOUSE_CLICK_WRITES = new String[][]{
            {"r 8", "v"},
            {"r 8", "v"},
            {"r 8", "v"},
    };

    /*
         Invokes
     */
    public static final String OBFUSCATED_DOACTION_CLASS_NAME = "kq";
    public static final String OBFUSCATED_DOACTION_FIELD_NAME = "lh";

    /*
        Obfuscated names for packets
     */
    public static final String EVENT_MOUSE_CLICK_OBFUSCATEDNAME = "ci";
    public static final String clientPacketClassName = "mm";
    public static final String packetWriterFieldName = "in";
    public static final String packetWriterClassName = "ed";
    public static final String mouseHandlerMillisMultiplier = "2357983475643731013";
    public static final String clientMillisMultiplier = "7764202104596476801";
    public static final String MouseHandler_lastPressedTimeMillisClass = "bc";
    public static final String MouseHandler_lastPressedTimeMillisField = "av";
    public static final String clientMillisField = "ds";
    public static final String classContainingGetPacketBufferNodeName = "ef";
    public static final String isaacCipherFieldName = "ai";
    public static final String packetBufferNodeClassName = "me";
    public static final String packetBufferFieldName = "ak";
    public static final String addNodeGarbageValue = "486"; //Just do a search in client.java packetWriterClassName property at class level, then search the variablename.addNodeMethodName
    public static final String addNodeMethodName = "ak";
    public static final String getPacketBufferNodeGarbageValue = "78"; //Just do a search for the classContainingGetPacketBufferNodeName usages and pick one of the byte values

    /*
        Obfuscated names for buffer methods
     */

    //To find these, basically search for the packetBufferNodeClassName class and find the field packetBufferFieldName and then find the type of that, find what it extends and it will be the byte[] and int properties
    public static final String bufferOffsetField = "am";
    public static final String bufferArrayField = "ae";
    public static final String indexMultiplier = "-1689308347";
    public static final String offsetMultiplier = "-725588083";
}