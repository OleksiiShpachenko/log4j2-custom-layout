package com.github.ivandzf.log4j2customlayout.utils;

import com.github.ivandzf.log4j2customlayout.message.CustomMessage;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;

/**
 * log4j2-custom-layout
 *
 * @author Divananda Zikry Fadilla (01 October 2018)
 * Email: divanandazf@gmail.com
 * <p>
 * Documentation here !!
 */
public class JsonUtils {

    private static Gson GSON = new Gson();

    public static Gson getGson() {
        return GSON;
    }

    public static CustomMessage generateCustomMessage(String message) {
        try {
            return getGson().fromJson(message, CustomMessage.class);
        } catch (JsonParseException ex) {
            return null;
        }
    }

}
