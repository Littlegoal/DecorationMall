package com.jzh.utils;

/**
 * 字符串工具类
 *
 * @author Junhao Zhou 2016/12/18
 */
public class StringUtil {

    /**
     * 判断字符串是否为null或者为空
     *
     * @param str 字符串
     * @return true 字符串为null或为空
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() != 0;
    }

}
