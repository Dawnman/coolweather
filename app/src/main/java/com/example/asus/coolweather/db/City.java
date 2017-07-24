package com.example.asus.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by asus on 2017/7/24.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;

    private int cityCode;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String name){
        cityName = name;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int code){
        cityCode = code;
    }
}
