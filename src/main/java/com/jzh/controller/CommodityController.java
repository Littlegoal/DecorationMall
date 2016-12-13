package com.jzh.controller;

import com.google.gson.Gson;
import com.jzh.model.Commodity;
import com.jzh.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
}
