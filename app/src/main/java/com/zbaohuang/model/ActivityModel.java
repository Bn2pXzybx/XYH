package com.zbaohuang.model;

/**
 * Created by zbaohuang on 16/3/26.
 */
public class ActivityModel {

    private String name;
    private String time;
    private String introduce;
    private String address;
    private String distance;
    private int type;


    public ActivityModel(String name, String time, String introduce, String address, String distance, int type) {
        this.name = name;
        this.time = time;
        this.introduce = introduce;
        this.address = address;
        this.distance = distance;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}


