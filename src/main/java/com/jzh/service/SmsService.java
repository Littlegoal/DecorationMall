package com.jzh.service;

import com.jzh.dto.Result;

/**
 * 短信相关
 *
 * @author Junhao Zhou 2016/12/25
 */
public interface SmsService {

    /**
     * 获取短信验证码
     *
     * @param phone 手机号
     * @return 结果
     */
    Result getVerificationCode(String phone);
}
