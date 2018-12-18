package com.qf.admin.service.impl;

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
    public List<Monthly> listMonthly() {
        return monthlyDao.listMonthly();
    }
}
