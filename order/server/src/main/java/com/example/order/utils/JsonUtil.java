package com.example.order.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author THY
 * @date 2018/12/7
 */
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 转换为json字符串
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * json 转 object
     * @param str
     * @param type
     * @return
     */
    public static Object fromJson(String str, Class type) {
        try {
            return objectMapper.readValue(str, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * json 转 object
     * @param str
     * @param type
     * @return
     */
    public static Object fromJson(String str, TypeReference type) {
        try {
            return objectMapper.readValue(str, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

