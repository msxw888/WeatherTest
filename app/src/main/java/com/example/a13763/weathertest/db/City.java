package com.example.a13763.weathertest.db;

import org.litepal.crud.LitePalSupport;

/**
 * 文件描述：
 *
 * @author：WJH
 * @Creatdata：2019/1/21
 * @Changedata：2019/1/21
 * @Version：
 */
public class City extends LitePalSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int proviceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName == null ? "" : cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProviceId() {
        return proviceId;
    }

    public void setProviceId(int proviceId) {
        this.proviceId = proviceId;
    }
}
