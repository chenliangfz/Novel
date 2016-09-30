package com.chenl.novel.util;

import com.chenl.novel.BuildConfig;
import com.orhanobut.logger.Logger;

/**
 * Created by ChenLiang on 16/9/30.
 */

public class L {

    private static boolean isDebug  = BuildConfig.DEBUG;

    static {
        Logger.init(BuildConfig.APPLICATION_ID);
    }

    public static void d(String message, Object... args) {
        if (isDebug){
            Logger.d(message, args);
        }
    }

    public static void d(Object object) {
        if (isDebug){
            Logger.d(object);
        }
    }

    public static void e(String message, Object... args) {
        if (isDebug){
            Logger.e(message, args);
        }
    }

    public static void e(Throwable throwable, String message, Object... args) {
        if (isDebug){
            Logger.e(throwable, message, args);
        }
    }

    public static void i(String message, Object... args) {
        if (isDebug){
            Logger.i(message, args);
        }
    }

    public static void v(String message, Object... args) {
        if (isDebug){
            Logger.v(message, args);
        }
    }

    public static void w(String message, Object... args) {
        if (isDebug){
            Logger.w(message, args);
        }
    }

    public static void wtf(String message, Object... args) {
        if (isDebug){
            Logger.wtf(message, args);
        }
    }

    /**
     * Formats the json content and print it
     *
     * @param json the json content
     */
    public static void json(String json) {
        if (isDebug){
            Logger.json(json);
        }
    }

    /**
     * Formats the json content and print it
     *
     * @param xml the xml content
     */
    public static void xml(String xml) {
        if (isDebug){
            Logger.xml(xml);
        }
    }
}
