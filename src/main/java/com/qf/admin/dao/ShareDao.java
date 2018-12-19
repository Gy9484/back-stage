package com.qf.admin.dao;

import com.alibaba.fastjson.JSONObject;
import com.qf.admin.pojo.po.ShareFlat;

import java.util.List;

public interface ShareDao {
    List<ShareFlat> listShareFlats(JSONObject jsonObject);

    Long countShareFlats(JSONObject jsonObject);
}
