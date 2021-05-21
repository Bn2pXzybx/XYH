package com.zbaohuang.model;

/**
 * Created by zbaohuang on 16/3/27.
 */
public class CareWarningModel {

    private String typeName;
    private String avatarUrl;
    private String datetime;
    private String content;
    private String alertContent;
    private String imageUrls;

    public CareWarningModel(String typeName, String avatarUrl, String datetime, String content, String alertContent, String imageUrls) {
        this.typeName = typeName;
        this.avatarUrl = avatarUrl;
        this.datetime = datetime;
        this.content = content;
        this.alertContent = alertContent;
        this.imageUrls = imageUrls;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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

    public String getAlertContent() {
        return alertContent;
    }

    public void setAlertContent(String alertContent) {
        this.alertContent = alertContent;
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
    }
}
