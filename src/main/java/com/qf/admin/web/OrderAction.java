package com.qf.admin.web;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.pojo.po.Order;
import com.qf.admin.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderAction {

    @Autowired
    private Orderservice orderservice;

    @GetMapping("/test")
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value = "/orders",method = RequestMethod.GET)
    public String toroder(){
        return "order";
    }




    @ResponseBody
    @RequestMapping(value = "/orders",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object listtoroder(@RequestBody JSONObject jsonObject){
        System.out.println(jsonObject);
        jsonObject = orderservice.listtoroder(jsonObject);
        return jsonObject;
    }


    @ResponseBody
    @RequestMapping(value = "/singleroder{orderId}",method = RequestMethod.GET)
    public Object singleroder(@PathVariable("orderId")int orderId){
        Object c =orderservice.singleroder(orderId);
        System.out.println(c);
        return orderservice.singleroder(orderId);

    }
    @RequestMapping(value = "/updateorder",method = RequestMethod.POST)
    public String updateorder(Order order){
        orderservice.updateorder(order);
        return "redirect:orders";
    }
    @ResponseBody
    @RequestMapping(value = "/deleteroder/{orderId}",method = RequestMethod.POST)
    public int deleteroder(@PathVariable("orderId") int orderId){
        return orderservice.deleteroder(orderId);
    }
}
