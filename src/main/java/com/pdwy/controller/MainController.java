package com.pdwy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by XinLian on 2016/6/28.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/jzh/index", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
