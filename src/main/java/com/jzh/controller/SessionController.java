package com.jzh.controller;

import com.jzh.dto.Result;
import com.jzh.service.CustomerService;
import com.jzh.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Session（登录）相关
 *
 * @author Junhao Zhou 2016/12/28
 */
@Controller("SessionController")
@RequestMapping("/session")
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
    @RequestMapping(value = "/customer", method = RequestMethod.POST,
            produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String login4Customer(String phone, char[] password, boolean rememberMe) {
        Result result = customerService.login(phone, password, rememberMe);
        return JsonUtils.toJsonString(result);
    }

    /**
     * 登出
     *
     * @return 登出结果
     */
    @RequestMapping(value = "/logout", method = RequestMethod.DELETE,
            produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String logout() {
        return JsonUtils.toJsonString(customerService.logout());
    }

}
