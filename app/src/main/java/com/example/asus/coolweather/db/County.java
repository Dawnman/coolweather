package com.example.asus.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by asus on 2017/7/24.
 */

public class County extends DataSupport {

    private int id;

    private String countyName;

    private int countyCode;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String name){
        countyName = name;
    }
    public int getCountyeCode(){
        return countyCode;
    }
    public void setCountyCodee(int code){
        countyCode = code;
    }
}
