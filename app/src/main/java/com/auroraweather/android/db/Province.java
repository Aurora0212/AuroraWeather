package com.auroraweather.android.db;


import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {

    private int id;

    private String provName;

    private int provCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvCode() {
        return provCode;
    }

    public void setProvCode(int provCode) {
        this.provCode = provCode;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

}
