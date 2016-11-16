package com.jzh.controller;

import com.jzh.service.CommodityHomepageRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Controller("commodityHomepageRecommendController")
public class CommodityHomepageRecommendController {

    @Autowired
    CommodityHomepageRecommendService commodityHomepageRecommendService;

    @RequestMapping(value = "/chrc/list", method = {RequestMethod.GET,RequestMethod.POST})
    public void list(){
        System.out.println(commodityHomepageRecommendService.listAll());
        System.out.println("ssssssssss");
    }
}
