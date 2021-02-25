package com.dk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName EachartsController
 * @Deacription TODO
 * @Author gao jie
 * @Date 2021/1/7 9:49
 * @Version 1.0
 **/
@Controller
@RequestMapping("echartsController")
public class EachartsController {

    @RequestMapping("eachats")
    public String eachats(){
        return "eacharts";
    }

    @RequestMapping("eachatsMap")
    @ResponseBody
    public Map<String,Object> eachatsMap(){
        Map<String,Object> map = new HashMap<>();
        String[] categories = {"外套","裤子","短袖","棉袄","衬衫"};
        int[] data = {5,20,15,30,1};
        int[] data1 = {2,10,15,40,16};
        map.put("categories",categories);
        map.put("data",data);
        map.put("data1",data1);
        return map;
    }
}

 

