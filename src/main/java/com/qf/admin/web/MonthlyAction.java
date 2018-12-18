package com.qf.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MonthlyAction {
    @GetMapping(value = "/monthly")
    public String monthly(){
        return "monthly";
    }
    @GetMapping(value = "index")
    public String index(){
        return "index";
    }
}
