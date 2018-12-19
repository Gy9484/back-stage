package com.qf.admin.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.dao.ShareDao;
import com.qf.admin.pojo.po.ShareFlat;
import com.qf.admin.service.ShareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareServiceImpl implements ShareService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ShareDao shareDao;
    @Override
    public JSONObject listShareFlatsJson(JSONObject jsonObject) {
        JSONObject jo = new JSONObject();
        try {
            List<ShareFlat> rows = shareDao.listShareFlats(jsonObject);
            Long total = shareDao.countShareFlats(jsonObject);
            jo.put("total", total);
            jo.put("rows", rows);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return jo;
    }
}
