package com.qf.admin.service;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.pojo.po.Monthly;

import java.util.List;

public interface MonthlyService {
    JSONObject listMonthly(JSONObject jsonObject);

    Monthly getMonthlyById(String id);

    int updateMonthlyById(Monthly monthly);
}
