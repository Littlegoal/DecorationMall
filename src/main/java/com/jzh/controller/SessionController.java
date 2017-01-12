package com.jzh.controller;

import com.jzh.dto.Result;
import com.jzh.service.CustomerService;
import com.jzh.utils.JsonUtils;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Session（登录）相关
 *
 * @author Junhao Zhou 2016/12/28
 */
@Controller("SessionController")
@RequestMapping("/session")
@Api(value = "Session", description = "登录相关")
public class SessionController {

    @Autowired
    private CustomerService customerService;

    /**
     * 用户登录
     *
     * @param phone      手机
     * @param password   密码
     * @param rememberMe 记住我
     * @return 登录结果
     */

    @RequestMapping(
            value = "/customer", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    @ResponseBody
    @ApiOperation(
            value = "用户登录",
            httpMethod = "POST",
            notes = "用户登录",
            response = Result.class
    )
    public String login4Customer(
            @RequestParam("phone")
            @ApiParam(
                    required = true,
                    name = "phone",
                    value = "手机号")
                    String phone,
            @RequestParam("password")
            @ApiParam(
                    required = true,
                    name = "password",
                    value = "密码")
                    char[] password,
            @RequestParam("captcha")
            @ApiParam(
                    name = "captcha",
                    value = "验证码"
            )
                    String captcha,
            @RequestParam("rememberMe")
            @ApiParam(
                    required = true,
                    name = "rememberMe",
                    value = "记住我？",
                    defaultValue = "true")
                    boolean rememberMe,
            @RequestParam("ref")
            @ApiParam(
                    name = "ref",
                    value = "重定向"
            )
                    String refUrl) {
        Result result = customerService.login(phone, password, rememberMe);

        return JsonUtils.toJsonString(result);
    }

    /**
     * 登出
     *
     * @return 登出结果
     */
    @RequestMapping(value = "", method = RequestMethod.DELETE,
            produces = "text/html;charset=UTF-8")
    @ResponseBody
    @ApiOperation(
            value = "登出",
            httpMethod = "DELETE",
            notes = "登出",
            response = Result.class
    )
    public String logout() {
        return JsonUtils.toJsonString(customerService.logout());
    }

}
