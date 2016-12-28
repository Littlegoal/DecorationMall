package com.jzh.utils;

import java.util.regex.Pattern;

/**
 * 字符串工具类
 *
 * @author Junhao Zhou 2016/12/18
 */
public class StringUtils {

    /**
     * 手机号正则表达式：<a href="http://www.jianshu.com/p/e8477fdccbe9">
     * http://www.jianshu.com/p/e8477fdccbe9<a/> (2015.8.6)
     */
    public static final String REGEX_PHONE = "^1(3[0-9]|4[57]|5[0-35-9]|7[0135678]|8[0-9])\\d{8}$";

    /**
     * 判断字符串是否为null或者为空
     *
     * @param str 字符串
     * @return true 字符串为null或为空
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * 通过给定的正则表达式regex对字符串input进行完全匹配
     *
     * @param input 字符串
     * @param regex 正则表达式, 不能为空
     * @return 匹配结果
     */
    public static boolean regexCheck(CharSequence input, String regex) {
        if (regex == null) {
            throw new IllegalArgumentException("regex con not be null!");
        }
        return Pattern.matches(regex, input);
    }

    /**
     * 通过正则表达式{@link #REGEX_PHONE}检查字符串是否是电话号码
     *
     * @param str 字符串
     * @return true 格式正确
     * false 字符串为空或者格式不正确
     */
    public static boolean isPhone(String str) {
        return !isEmpty(str) && regexCheck(str, REGEX_PHONE);
    }
}
