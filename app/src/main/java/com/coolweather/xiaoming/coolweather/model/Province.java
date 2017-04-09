package com.coolweather.xiaoming.coolweather.model;

/**
 * Created by xiaoming on 17-4-4.
 */

public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId(int id){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String province_name){
        this.provinceName = provinceName;
    }

    public String getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(String province_code){
        this.provinceCode = provinceCode;
    }
}
