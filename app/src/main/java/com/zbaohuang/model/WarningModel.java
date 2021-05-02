package com.zbaohuang.model;

import java.util.List;

/**
 * Created by zbaohuang on 16/3/25.
 */
public class WarningModel {

    private String userName;
    private String datetime;
    private String content;
    private String images;

    public WarningModel(String userName, String datetime, String content, String images) {
        this.userName = userName;
        this.datetime = datetime;
        this.content = content;
        this.images = images;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String[] getImageList(){
        if (this.images != null && this.images.contains(",")){
            return this.images.split(",");
        }
        return new String[]{};
    }
}
