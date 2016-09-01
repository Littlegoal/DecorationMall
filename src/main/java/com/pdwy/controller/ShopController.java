package com.pdwy.controller;

import com.pdwy.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by MaYunpeng on 2016/8/30.
 */
@Controller("ShopController")
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    ShopService shopService;

    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView listShop() {
        return new ModelAndView("shop/shop_list")
                .addObject("pageObj", shopService.listAll());
    }
}
