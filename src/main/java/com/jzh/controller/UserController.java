package com.jzh.controller;

import com.jzh.dto.Result;
import com.jzh.service.SmsService;
import com.jzh.utils.JsonUtils;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Junhao Zhou 2016/12/17
 */

@RequestMapping("/user")
@Controller("userController")
public class UserController {

    @Autowired
    private SmsService smsService;

    /**
     * 新用户注册
     *
     * @return 结果
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ApiOperation(
            value = "新用户注册",
            httpMethod = "POST",
            notes = "新用户注册"
    )
    public String register() {
        return "";
    }

    /**
     * 获取手机验证码
     *
     * @param phone 手机号
     * @return 结果
     */
    @RequestMapping(value = "/v_code", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    @ApiOperation(
            value = "获取手机验证码",
            httpMethod = "GET",
            notes = "获取手机验证码"
    )
    public String getSmsVerificationCode(
            @RequestParam("phone")
            @ApiParam(
                    name = "手机号",
                    value = "手机号",
                    required = true
            )
                    String phone) {
        Result result = smsService.getVerificationCode(phone);
        return JsonUtils.toJsonString(result);
    }
}
