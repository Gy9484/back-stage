package com.qf.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Action {

    @GetMapping("/test")
    public String toIndex(){
        return "index";
    }
}
