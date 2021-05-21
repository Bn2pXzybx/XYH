package com.zbaohuang.fragment;

/**
 * Created by zbaohuang on 16/3/27.
 */
public class CommentModel {

    private String username;
    private String avatarUrl;
    private String datetime;
    private String content;

    public CommentModel(){

    }

    public CommentModel(String username, String avatarUrl, String datetime, String content) {
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.datetime = datetime;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
