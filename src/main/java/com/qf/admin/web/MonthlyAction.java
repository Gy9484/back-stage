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

    @ResponseBody
    @RequestMapping(value = "/listMonthly",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public Object listMonthly(@RequestBody JSONObject jsonObject){
        jsonObject = monthlyService.listMonthly(jsonObject);
        return jsonObject;
    }
    @ResponseBody
    @GetMapping(value = "monthly/{id}")
    public Monthly getMonthlyById(@PathVariable("id")String id){
        return monthlyService.getMonthlyById(id);
    }
    @ResponseBody
    @PostMapping(value = "/monthly")
    public Boolean updateMonthlyById(Monthly monthly){
        int i = monthlyService.updateMonthlyById(monthly);
        Boolean b = (i>0)?true:false;
        return b;

    }

}
