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
public class County extends LitePalSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName == null ? "" : countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    public String getWeatherId() {
        return weatherId == null ? "" : weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
