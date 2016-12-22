package com.jzh.controller;

import com.google.gson.Gson;
import com.jzh.model.Commodity;
import com.jzh.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@RequestMapping("/commodity")
@Controller("CommodityController")
public class CommodityController {

    @Autowired
    CommodityService commodityService;

    /**
     * 插入commodity
     * @param requsetBody
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insert(@RequestBody String requsetBody) {

        Gson gson = new Gson();
        Commodity commodity = gson.fromJson(requsetBody,Commodity.class);
        commodityService.insert(commodity);
    }

    /**
     * 获取未删除的commodity
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String list(){

        List<Commodity> list = commodityService.listAll();
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    /**
     * 更新commodity
     * @param requsetBody
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public void update(@RequestBody String requsetBody){

        Gson gson = new Gson();
        Commodity commodity = gson.fromJson(requsetBody,Commodity.class);
        commodityService.update(commodity);
    }

    /**
     * 多关键字搜索
     *
     * @param str1
     * @param str2
     * @return
     */
    @RequestMapping(value = "/search/{str1}/{str2}/{typeId}",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String searchByKeywords(@PathVariable String str1, @PathVariable String str2,@PathVariable Long typeId){
        List<String> keywords = new ArrayList<>();
        keywords.add(str1);
        keywords.add(str2);

        String str3 = null;
        keywords.add(str3);

        Map<String,Object> map = new HashMap<>();
        map.put("keywords",keywords);
        map.put("typeId",typeId);

        Gson gson = new Gson();
        List<Commodity> list = commodityService.searchPageForCustomerByConditions(1,10,map).getList();
        return gson.toJson(list);
    }
}
