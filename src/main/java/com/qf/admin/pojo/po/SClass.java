package com.qf.admin.pojo.po;

import java.util.List;

public class SClass {

    private int cid;
    private String cname;

    private List<Student> list;

    public SClass() {
    }

    public SClass(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "SClass{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", list=" + list +
                '}';
    }
}
