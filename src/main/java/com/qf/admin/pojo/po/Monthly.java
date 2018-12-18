package com.qf.admin.pojo.po;

public class Monthly {
    private String name;
    private double monthlyRent;
    private String area;
    private String id;
    private String houseType;
    private String payType;
    private String orientation;
    private String floor;
    private String district;
    private String subway;
    private String configuration;

    public Monthly() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return "Monthly{" +
                "name='" + name + '\'' +
                ", monthlyRent=" + monthlyRent +
                ", area='" + area + '\'' +
                ", id='" + id + '\'' +
                ", houseType='" + houseType + '\'' +
                ", payType='" + payType + '\'' +
                ", orientation='" + orientation + '\'' +
                ", floor='" + floor + '\'' +
                ", district='" + district + '\'' +
                ", subway='" + subway + '\'' +
                ", configuration='" + configuration + '\'' +
                '}';
    }
}
