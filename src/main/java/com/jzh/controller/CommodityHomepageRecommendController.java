package com.jzh.controller;

import com.jzh.service.CommodityHomepageRecommendService;
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

    @RequestMapping(value = "/chrc/list", method = {RequestMethod.GET,RequestMethod.POST})
    public void list(){
        System.out.println(commodityHomepageRecommendService.listAll());
        System.out.println("ssssssssss");
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
    public String list1() throws IOException {
        File file = new File("C:\\Users\\XinLian\\Desktop\\test.json");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        br.close();
        return line;
//        String str = "{\"id\":123456,\"name\":\"小店铺\",\"contact\":{\"qq\":\"QQ\",\"qrcode\":\"\",\"phone\":\"199999999\",\"name\":\"小张\"},\"introduction\":\"介绍\",\"img\":\"\",\"classes\":[{\"name\":\"全部用品\",\"id\":0},{\"name\":\"卧室用品\",\"id\":1},{\"name\":\"床品\",\"id\":2}],\"goodsInfo\":{\"currentClass\":\"1\",\"goods\":[{\"id\":123,\"title\":\"合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗\",\"price\":2011.0,\"mainImg\":\"http://www.hetaojia.com/shop/hetao/index/2-1.jpg\"},{\"id\":456,\"title\":\"合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗\",\"price\":2012.0,\"mainImg\":\"http://www.hetaojia.com/shop/hetao/index/2-1.jpg\"},{\"id\":111,\"title\":\"合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗\",\"price\":2013.0,\"mainImg\":\"http://www.hetaojia.com/shop/hetao/index/2-1.jpg\"},{\"id\":222,\"title\":\"合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗\",\"price\":2014.0,\"mainImg\":\"http://www.hetaojia.com/shop/hetao/index/2-1.jpg\"},{\"id\":333,\"title\":\"合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗\",\"price\":2015.0,\"mainImg\":\"http://www.hetaojia.com/shop/hetao/index/2-1.jpg\"},{\"id\":444,\"title\":\"合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗\",\"price\":2016.0,\"mainImg\":\"http://www.hetaojia.com/shop/hetao/index/2-1.jpg\"}],\"page\":2,\"totalPage\":4,\"totalCount\":34}}\n";
//        return str;
    }
}
