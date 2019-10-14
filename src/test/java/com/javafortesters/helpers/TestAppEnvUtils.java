package com.javafortesters.helpers;

public class TestAppEnvUtils {
    public static final String PORT = "67";
    public static final String DOMAIN = "192.123.0.3";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
    }
}
