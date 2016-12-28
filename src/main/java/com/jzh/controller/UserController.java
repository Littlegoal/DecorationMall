package com.jzh.controller;

import com.jzh.dto.Result;
import com.jzh.service.SmsService;
import com.jzh.utils.JsonUtils;
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
    private SmsService smsService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register() {
        return "";
    }

    @RequestMapping(value = "/v_code", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getSmsVerificationCode(String phone) {
        Result result = smsService.getVerificationCode(phone);
        return JsonUtils.toJsonString(result);
    }
}
