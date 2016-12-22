package com.jzh.utils;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * <p>安全的字符串。因为String的无法修改、删除的性质导致String的内容只有GC时才会清空，
 * 因此在GC前数据会一直在内存中，用String存储密码、身份证号等敏感信息的时候存在一定的安全隐患。</p>
 * <p>
 * <p>本类使用char[]存储数据，可以在不需要的时候对数据进行覆盖，
 * 记得在合适的时候调用{@link #clear()}或者{@link #clearWith(char)}方法，清除敏感数据</p>
 * <p>
 * <p>为了安全，本类的{@link #toString()}方法不会返回任何与敏感信息相关的数据，
 * 在使用`+`的时候需要注意，可能不会得到想要的结果</p>
 *
 * @author Junhao Zhou 2016/12/21
 */
public class SecurityString {

    /**
     * 默认编码模式 UTF-8
     */
    private static final String DEFAULT_ENCODE = "UTF-8";

    private char[] data;

    private String encode;

    public static SecurityString wrap(String data) {
        return wrap(data, DEFAULT_ENCODE);
    }

    public static SecurityString wrap(String data, String encode) {
        if (data == null) {
            return wrap(new char[0], encode);
        }
        return wrap(data.toCharArray(), encode);
    }

    public static SecurityString wrap(char[] data) {
        return wrap(data, DEFAULT_ENCODE);
    }

    public static SecurityString wrap(char[] data, String encode) {
        return new SecurityString(data, encode);
    }

    private SecurityString(char[] data, String encode) {
        this.encode = encode;
        if (data == null) {
            if (this.data == null) { // 保证data一定不为null
                this.data = new char[0];
            }
            return;
        }
        // 逻辑较为简单，不优化了
        this.data = new char[data.length];
        this.data = Arrays.copyOf(data, data.length);
        // 将源数据清空
        for (int i = 0; i < data.length; i++) {
            data[i] = '\u0000';
        }
    }

    private void updateData(char[] data, String encode) {

    }

    public char[] getData() {
        return data;
    }

    public String getEncode() {
        return encode;
    }

    /**
     * 获取长度
     *
     * @return 长度。注意，如果数据为空，长度也为0
     */
    public int length() {
        return data == null ? 0 : data.length;
    }

    /**
     * 数据是否为空
     *
     * @return <p>true null or length == 0</p>
     * <p>false not null & length > 0</p>
     */
    public boolean isEmpty() {
        return length() == 0;
    }

    /**
     * 追加数据
     *
     * @param append 待追加的数据
     */
    public void append(String append) {
        if (append == null) {
            return;
        }
        append(append.toCharArray());
    }

    /**
     * 在尾部追加数据
     *
     * @param append 待追加的数据
     */
    public void append(char[] append) {
        if (append == null || append.length == 0) {
            return;
        }
        int totalLength = length() + append.length;
        char[] tmp = this.data;
        this.data = new char[totalLength];
        System.arraycopy(tmp, 0, this.data, 0, tmp.length);
        System.arraycopy(append, 0, this.data, tmp.length, append.length);
    }

    public byte[] toBytes() {
        CharBuffer charBuffer = CharBuffer.wrap(this.data);
        ByteBuffer byteBuffer = Charset.forName(encode).encode(charBuffer);
        byte[] bytes = Arrays.copyOfRange(byteBuffer.array(),
                byteBuffer.position(), byteBuffer.limit());
        Arrays.fill(charBuffer.array(), '\u0000');
        Arrays.fill(byteBuffer.array(), (byte) 0);
        return bytes;
    }

    /**
     * 清除数据，默认使用'u0000'占位
     */
    public void clear() {
        clearWith('\u0000');
    }

    /**
     * 清除数据，使用target填充数据
     *
     * @param target target
     */
    public void clearWith(char target) {
        if (data != null) {
            Arrays.fill(data, target);
            data = null;
        }
    }

    /**
     * 注意，toString不能暴露敏感信息，因此不会返回任何具体的字符串
     *
     * @return toString
     */
    @Override
    public String toString() {
        return super.toString(); // 不会将敏感信息打印
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof SecurityString) {
            final SecurityString tmp = (SecurityString) obj;
            if (tmp.data == null || this.data == null
                    || tmp.encode == null || this.encode == null) {
                return false;
            }
            if (tmp.encode.equals(this.encode)) { // String.equals会处理this.encode为null的情况
                if (tmp.data == this.data) {
                    if (tmp.length() != this.length()) {
                        return false;
                    }
                    for (int i = 0; i < tmp.length(); i++) {
                        if (tmp.data[i] != this.data[i]) {
                            return false;
                        }
                    }
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        // TODO 完善
        return super.hashCode();
    }
}
