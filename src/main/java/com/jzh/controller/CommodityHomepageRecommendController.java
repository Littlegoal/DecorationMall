package com.jzh.controller;

import com.google.gson.Gson;
import com.jzh.model.Commodity;
import com.jzh.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Controller("commodityHomepageRecommendController")
public class CommodityHomepageRecommendController {

    @Autowired
    CommodityHomepageRecommendService commodityHomepageRecommendService;
    @Autowired
    CommodityTypeLevelOneService commodityTypeLevelOneService;
    @Autowired
    CommodityTypeLevelThreeService commodityTypeLevelThreeService;
    @Autowired
    CommodityTypeLevelTwoService commodityTypeLevelTwoService;
    @Autowired
    CommodityService commodityService;
    @Autowired
    CustomerService customerService;
    @Autowired
    BusinessService businessService;
    @Autowired
    ShopService shopService;

    @RequestMapping(value = "/chrc/list", method = {RequestMethod.GET,RequestMethod.POST})
    public void list(){
        Gson gson = new Gson();

        String str1 = gson.toJson(commodityHomepageRecommendService.listAll());
        String str2 = gson.toJson(commodityService.listAll());
        String str3 = gson.toJson(commodityTypeLevelOneService.listAll());
        String str4 = gson.toJson(commodityTypeLevelThreeService.listAll());
        String str5 = gson.toJson(commodityTypeLevelTwoService.listAll());
        String str6 = gson.toJson(shopService.listAll());
        String str7 = gson.toJson(customerService.listAll());
        String str8 = gson.toJson(businessService.listAll());

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);

    }

    @RequestMapping(value = "/", method = {RequestMethod.GET,RequestMethod.POST})
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/shop/123", method = {RequestMethod.GET,RequestMethod.POST})
    public String shop(){
        return "index";
    }

    @RequestMapping(value = "/api/shop/123", method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String shopData() throws IOException {
        File file = new File("C:\\Users\\XinLian\\Desktop\\shopDetail.json");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        br.close();
        return line;
    }

    @RequestMapping(value = "/goods/123", method = {RequestMethod.GET,RequestMethod.POST})
    public String goods(){
        return "index";
    }

    @RequestMapping(value = "/api/goods/123", method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String goodsData() throws IOException {
        File file = new File("C:\\Users\\XinLian\\Desktop\\goodsDetail.json");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        br.close();
        return line;
    }
}
