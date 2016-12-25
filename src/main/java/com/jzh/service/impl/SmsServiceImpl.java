package com.jzh.service.impl;

import com.jzh.dto.Result;
import com.jzh.service.SmsService;
import com.jzh.utils.StringUtil;

/**
 * @author Junhao Zhou 2016/12/25
 */
public class SmsServiceImpl implements SmsService {



    @Override
    public Result getVerificationCode(String phone) {
        Result result = new Result();
        // step 1: 检查手机号格式
        if (StringUtil.isEmpty(phone)) {
            result.setSuccess(false);
            result.setMessage("手机号码格式不正确！");

            return result;
        }

        // step 2: 检查接口调用频率
        if (!checkFrequency()) {
            result.setMessage("");
            result.setSuccess(false);

            return result;
        }
        // step 3: 检查手机号是否已经存在

        // step 4: 生成验证码并调用短信发送服务

        // step 5: 处理短信发送结果
        return result;
    }

    private boolean checkFrequency() {
        return true;
    }
}
