package com.jzh.controller;

import com.google.gson.Gson;
import com.jzh.service.CommodityTypeLevelThreeService;
import com.jzh.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Controller("shopController")
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    ShopService shopService;
    @Autowired
    CommodityTypeLevelThreeService commodityTypeLevelThreeService;

    @RequestMapping(value = "/test",method = {RequestMethod.GET,RequestMethod.POST},produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String test() {
        String str = "1,2,3";
        Gson gson = new Gson();

        return gson.toJson(commodityTypeLevelThreeService.getCategoryListByCommodityTypes(str));
    }
}
