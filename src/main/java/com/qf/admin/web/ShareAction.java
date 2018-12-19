package com.qf.admin.web;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShareAction {
    @Autowired
    private ShareService shareService;

    @GetMapping("/share")
    public String page(){
        return "share";
    }

    @ResponseBody
    @RequestMapping(value = "/shareFlats",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object listShareFlatsJson(@RequestBody JSONObject jsonObject) {
        System.out.println(jsonObject);
        jsonObject = shareService.listShareFlatsJson(jsonObject);
        return jsonObject;
    }
}
