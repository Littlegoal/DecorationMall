package com.jzh.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jzh.model.Worker;
import com.jzh.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
@Controller("workerController")
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    /**
     * 获取未删除的worker
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String list() {

        List<Worker> list = workerService.listAll();
        Gson gson =  new Gson();
        return gson.toJson(list);
    }

    /**
     * 插入worker
     * @param requsetBody
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insert(@RequestBody String requsetBody) {

        Gson gson = new Gson();
        Worker worker = gson.fromJson(requsetBody,Worker.class);
        workerService.insert(worker);
    }

    /**
     * 更新worker
     * @param requsetBody
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public void update(@RequestBody String requsetBody){

        Gson gson = new Gson();
        Worker worker = gson.fromJson(requsetBody,Worker.class);
        workerService.update(worker);
    }

    /**
     * 删除worker
     * @param id
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public void delete(@PathVariable Long id){
        workerService.delete(id);
    }

    /**
     * 分页
     */
    @RequestMapping(value = "/page/{pageNum}/{pageSize}",method = RequestMethod.GET)
    @ResponseBody
    public String page(@PathVariable int pageNum, @PathVariable int pageSize) {

        List<String> keywords = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        PageInfo page = workerService.searchPageForCustomerByConditions(pageNum,pageSize,map);
        Gson gson = new Gson();
        System.out.println(page.getTotal());
        return gson.toJson(page.getList());
    }
}
