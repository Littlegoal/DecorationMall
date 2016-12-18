package com.jzh.utils;

import org.apache.shiro.codec.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * 提供数字摘要工具,支持{@link #MD5},{@link #SHA},{@link #SHA_256},{@link #SHA_512}。
 *
 * @author Junhao Zhou 2016/12/17
 */
public class DigestUtil {

    private static final Log logger = Log.getLog(DigestUtil.class);

    public static final String MD5 = "MD5";

    public static final String SHA = "SHA";

    public static final String SHA_256 = "SHA-256";

    public static final String SHA_512 = "SHA-512";

    /**
     * 对字符串生成摘要
     *
     * @param algorithm 摘要算法，支持{@link #MD5},{@link #SHA},{@link #SHA_256},{@link #SHA_512}。
     * @param message   字符串
     * @return 16进制编码摘要
     */
    public static String digest(String algorithm, String message) {
        return digest(algorithm, message.getBytes());
    }

    /**
     * 对字节生成摘要
     *
     * @param algorithm 摘要算法，支持{@link #MD5},{@link #SHA},{@link #SHA_256},{@link #SHA_512}。
     * @param message   字节
     * @return 摘要
     */
    public static String digest(String algorithm, byte[] message) {
        return Hex.encodeToString(digest(getDigest(algorithm), message));
    }

    private static MessageDigest getDigest(String algorithm) {
        try {
            return MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            logger.error("MessageDigest " + algorithm + " not exist!", e);
            return null;
        }
    }

    /**
     * 生成摘要
     *
     * @param digest  摘要算法
     * @param message 消息
     * @return 摘要
     */
    private static byte[] digest(MessageDigest digest, byte[] message) {
        return digest.digest(message);
    }

    /**
     * 盐值默认长度
     */
    private static final int DEFAULT_SALT_LENGTH = 25;

    private static final Random saltRandom = new SecureRandom();

    /**
     * 生成盐，默认长度为{@link #DEFAULT_SALT_LENGTH}
     *
     * @return 盐
     */
    public static byte[] generateSalt() {
        return generateSalt(DEFAULT_SALT_LENGTH);
    }

    /**
     * 生成盐
     *
     * @param saltLength 盐值长度
     * @return 盐
     */
    public static byte[] generateSalt(int saltLength) {
        if (saltLength <= 0) {
            saltLength = DEFAULT_SALT_LENGTH;
        }
        byte[] salt = new byte[saltLength];
        saltRandom.nextBytes(salt);
        return salt;
    }
}
