package com.coolweather.xiaoming.coolweather.model;

/**
 * Created by xiaoming on 17-4-4.
 */

public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = this.id;
    }

    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String county_name){
        this.countyName = countyName;
    }

    public String getCountyCode(){
        return countyCode;
    }
    public void setCountyCode(String county_code){
        this.countyCode = countyCode;
    }

    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = this.cityId;
    }
    public void setProvinceId(){
        this.cityId = cityId;
    }

}
