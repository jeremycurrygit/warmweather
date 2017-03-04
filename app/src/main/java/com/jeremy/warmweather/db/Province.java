package com.jeremy.warmweather.db;

/**
 * Created by asusl on 2017/3/4.
 */

public class Province extends DataSupport {
    private int id;
    private String provindeName;
    private int provindeCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvindeName() {
        return provindeName;
    }

    public void setProvindeName(String provindeName) {
        this.provindeName = provindeName;
    }

    public int getProvindeCode() {
        return provindeCode;
    }

    public void setProvindeCode(int provindeCode) {
        this.provindeCode = provindeCode;
    }
}
