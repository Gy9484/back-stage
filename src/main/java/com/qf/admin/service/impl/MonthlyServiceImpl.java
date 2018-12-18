package com.qf.admin.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.dao.MonthlyDao;
import com.qf.admin.pojo.po.Monthly;
import com.qf.admin.service.MonthlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MonthlyServiceImpl implements MonthlyService {

    @Autowired
    private MonthlyDao monthlyDao;

    @Override
    public JSONObject listMonthly(JSONObject jsonObject) {
        JSONObject jo = new JSONObject();
        List<Monthly> rows = monthlyDao.listMonthly(jsonObject);
        Long total = monthlyDao.countMonthly(jsonObject);
        jo.put("total",total);
        jo.put("rows",rows);
        return jo;
    }
}
