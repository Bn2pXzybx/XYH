package com.zbaohuang.model;

import com.zbaohuang.utils.DateUtils;

import java.util.Date;

/**
 * Created by zbaohuang on 16/3/26.
 */
public class VisitorRecordModel {

    private String datetime;
    private String imageUrl;
    public VisitorRecordModel(String datetime, String imageUrl) {
        this.datetime = datetime;
        this.imageUrl = imageUrl;
    }


    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getIntDateTime(){
        try {
            Date date = DateUtils.stringToDate(this.datetime,"yyyy-MM-dd");
            String result = DateUtils.dateToString(date, "yyyymmdd");
            return Integer.parseInt(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public String getDate(){
        try {
            Date date = DateUtils.stringToDate(this.datetime,"yyyy-MM-dd");
            String result = DateUtils.dateToString(date,"dd日MM月");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
