package com.qf.admin.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.dao.OrderDao;
import com.qf.admin.pojo.po.Order;
import com.qf.admin.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Orderimpl implements Orderservice {
    @Autowired
    private OrderDao orderDao;
    @Override
    public JSONObject listtoroder(JSONObject jsonObject) {
        JSONObject jo = new JSONObject();
        try {
            List<Order> rows = orderDao.listoroder(jsonObject);
            jo.put("rows",rows);
            Long total = orderDao.countroder(jsonObject);
            jo.put("total",total);
        }catch (Exception e){
            e.printStackTrace();
        }
        return jo;
    }

    @Override
    public Object singleroder(int orderId) {
            Order order = null;
            try {
                order = orderDao.singleroder(orderId);

            }catch (Exception e){
                e.printStackTrace();
            }

            return order;
        }

    @Override
    public int deleteroder(int orderId) {
       return  orderDao.deleteroder(orderId);

    }

    @Override
    public void updateorder(Order order) {
        orderDao.updateorder(order);
    }
}
