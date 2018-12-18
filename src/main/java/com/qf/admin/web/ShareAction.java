package com.qf.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShareAction {
    @GetMapping("/share")
    public String page(){
        return "share";
    }
}
