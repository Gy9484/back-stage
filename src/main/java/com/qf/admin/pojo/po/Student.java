package com.qf.admin.pojo.po;

public class Student {

    private int sid;
    private String sname;


    private SClass sClass;

    public Student() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public SClass getSClass() {
        return sClass;
    }

    public void setSclass(SClass sClass) {
        this.sClass = sClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sclass=" + sClass +
                '}';
    }
}
