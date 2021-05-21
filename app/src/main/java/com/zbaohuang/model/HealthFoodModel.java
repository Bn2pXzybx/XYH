package com.zbaohuang.model;

/**
 * Created by zbaohuang on 16/3/27.
 */
public class HealthFoodModel {

    private String foodName;
    private String foodUser;
    private String business;
    private String address;
    private String distance;

    public HealthFoodModel(){}

    public HealthFoodModel(String foodName, String foodUser, String business, String address, String distance) {
        this.foodName = foodName;
        this.foodUser = foodUser;
        this.business = business;
        this.address = address;
        this.distance = distance;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodUser() {
        return foodUser;
    }

    public void setFoodUser(String foodUser) {
        this.foodUser = foodUser;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
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
}
