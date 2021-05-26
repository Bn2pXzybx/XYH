package com.zbaohuang.model;

/**
 * Created by zbaohuang on 16/3/29.
 */
public class AnalysisModel {

    private String date;
    private String time;
    private int type;
    private String imageurl;
    private String attribute;

    public AnalysisModel(){}

    public AnalysisModel(String date, String time, int type, String imageurl, String attribute) {
        this.date = date;
        this.time = time;
        this.type = type;
        this.imageurl = imageurl;
        this.attribute = attribute;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
