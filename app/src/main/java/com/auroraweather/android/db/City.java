package com.auroraweather.android.db;


import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int ProvId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvId() {
        return ProvId;
    }

    public void setProvId(int provId) {
        ProvId = provId;
    }

}
