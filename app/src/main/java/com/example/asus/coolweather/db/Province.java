package com.example.asus.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by asus on 2017/7/24.
 */

public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String name){
        provinceName = name;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int code){
        provinceCode = code;
    }

}
