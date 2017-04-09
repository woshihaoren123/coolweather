package com.coolweather.xiaoming.coolweather.model;

/**
 * Created by xiaoming on 17-4-4.
 */

public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;

    public int getId(int id){
        return this.id;
    }
    public void setId(){
        this.id = id;
    }

    public String getCityName(){
        return cityName;
    }
    public void setCityName(String province_name){
        this.cityName = cityName;
    }

    public String getCityCode(){
        return cityCode;
    }
    public void setCityCode(String city_code){
        this.cityCode = cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(){
        this.provinceId = provinceId;
    }
}
