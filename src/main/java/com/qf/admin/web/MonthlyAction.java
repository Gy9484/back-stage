package com.qf.admin.web;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.pojo.po.Monthly;
import com.qf.admin.service.MonthlyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class MonthlyAction {
    @Autowired
    private MonthlyService monthlyService;
    @GetMapping(value = "/monthly")
    public String monthly(){
        return "monthly";
    }
    @GetMapping(value = "index")
    public String index(){
        return "index";
    }
    @ResponseBody
    @RequestMapping(value = "/listMonthly",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public Object listMonthly(@RequestBody JSONObject jsonObject){
        jsonObject = monthlyService.listMonthly(jsonObject);
        return jsonObject;

    }

}
