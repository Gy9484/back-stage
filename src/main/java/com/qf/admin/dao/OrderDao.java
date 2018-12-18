package com.qf.admin.dao;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.pojo.po.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {


    List<Order> listoroder(JSONObject jsonObject);

    Long countroder(JSONObject jsonObject);


    Order singleroder(@Param("orderId") int orderId);

    void updateorder(Order order);

    int deleteroder(int orderId);
}
