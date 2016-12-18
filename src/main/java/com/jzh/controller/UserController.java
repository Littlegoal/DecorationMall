package com.jzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Junhao Zhou 2016/12/17
 */

@RequestMapping("/user")
@Controller("userController")
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(String username, String password, boolean rememberMe) {
        return "";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.DELETE)
    public String logout() {
        return "";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register() {
        return "";
    }
}
