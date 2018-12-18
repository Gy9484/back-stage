package com.qf.admin.dao;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.pojo.po.Monthly;

import java.util.List;

public interface MonthlyDao {
    List<Monthly> listMonthly(JSONObject jsonObject);

    Long countMonthly(JSONObject jsonObject);

    Monthly getMonthlyById(String id);

    int updateMonthlyById(Monthly monthly);
}
