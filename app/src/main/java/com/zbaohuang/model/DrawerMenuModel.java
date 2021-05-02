package com.zbaohuang.model;


import android.support.v4.app.Fragment;

/**
 * Created by zbaohuang on 16/3/24.
 */
public class DrawerMenuModel {

    private int menuId;
    private int resId;
    private String name;
    private Fragment fragment;

    public DrawerMenuModel(int menuId, int resId, String name, Fragment fragmentName) {
        this.menuId = menuId;
        this.resId = resId;
        this.name = name;
        this.fragment = fragmentName;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fragment getFragmentName() {
        return fragment;
    }

    public void setFragmentName(Fragment fragmentName) {
        this.fragment = fragmentName;
    }
}
