package com.jzh.controller;

import com.jzh.dto.Result;
import com.jzh.service.CustomerService;
import com.jzh.service.SmsService;
import com.jzh.utils.JsonUtils;
import com.wordnik.swagger.annotations.Api;
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

@RequestMapping("/register")
@Controller("registerController")
public class RegisterController {

    @Autowired
    private SmsService smsService;

    @Autowired
    private CustomerService customerService;

    /**
     * 用户注册
     *
     * @param phone    手机号
     * @param password 密码
     * @param vCode    短信验证码
     * @param name     昵称
     * @return 注册结果
     */
    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    @ApiOperation(
            value = "新用户注册",
            httpMethod = "POST",
            notes = "新用户注册"
    )
    public String register4Customer(
            @RequestParam(value = "phone")
            @ApiParam(
                    name = "手机号",
                    value = "手机号",
                    required = true
            )
                    String phone,
            @RequestParam(value = "password")
            @ApiParam(
                    name = "密码",
                    value = "密码",
                    required = true
            )
                    char[] password,
            @RequestParam("phoneCode")
            @ApiParam(
                    name = "短信验证码",
                    value = "短信验证码",
                    required = true
            )
                    String vCode,
            @RequestParam("nickname")
            @ApiParam(
                    name = "昵称",
                    value = "昵称",
                    required = true
            )
                    String name) {
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
