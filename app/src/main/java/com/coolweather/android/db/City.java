package com.coolweather.android.db;

import android.provider.ContactsContract;

import org.litepal.crud.DataSupport;

/**
 * Created by zlm on 2018/8/28.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCodee;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public int getCityCodee(){
        return cityCodee;
    }
    public void setCityCodee(int cityCodee){
        this.cityCodee = cityCodee;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
