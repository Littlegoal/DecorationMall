package com.jzh.utils;

import com.google.gson.Gson;

/**
 * Json工具类
 *
 * @author Junhao Zhou 2016/12/28
 */
public class JsonUtils {

    /**
     * 将对象转成json字符串，通过封装可以更换不同json解析库以及简化一些代码
     *
     * @param src 待转换的对象
     * @return json字符串
     */
    public static String toJsonString(Object src) {
        return new Gson().toJson(src);
    }
}
