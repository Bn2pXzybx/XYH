package com.zbaohuang.model;

/**
 * Created by zbaohuang on 16/3/27.
 */
public class VolunteerModel {

    private String userName;
    private String avatarUrl;
    private String totalCount;
    private String likeCount;
    private String datetime;
    private String comeFrom;
    private String loveZone;

    public VolunteerModel()
    {

    }

    public VolunteerModel(String userName, String avatarUrl, String totalCount, String likeCount, String datetime, String comeFrom, String loveZone) {
        this.userName = userName;
        this.avatarUrl = avatarUrl;
        this.totalCount = totalCount;
        this.likeCount = likeCount;
        this.datetime = datetime;
        this.comeFrom = comeFrom;
        this.loveZone = loveZone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }

    public String getLoveZone() {
        return loveZone;
    }

    public void setLoveZone(String loveZone) {
        this.loveZone = loveZone;
    }
}
