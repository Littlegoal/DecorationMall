package com.jzh.controller;

import com.google.gson.Gson;
import com.jzh.dto.Result;
import com.jzh.service.CustomerService;
import com.jzh.service.SmsService;
import com.jzh.utils.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Junhao Zhou 2016/12/17
 */

@RequestMapping("/user")
@Controller("userController")
public class UserController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private SmsService smsService;

    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String login(String phone, char[] password, boolean rememberMe) {
        Result result = customerService.login(phone, password, rememberMe);
        return new Gson().toJson(result);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String logout() {
        return new Gson().toJson(customerService.logout());
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register() {
        return "";
    }

    @RequestMapping(value = "/v_code", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getSmsVerificationCode(String phone) {
        Result result = smsService.getVerificationCode(phone);
        return new Gson().toJson(result);
    }
}
