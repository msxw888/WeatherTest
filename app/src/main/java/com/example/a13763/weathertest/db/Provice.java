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
public class Provice extends LitePalSupport {

    private int id;
    private String proviceName;
    private int prviceceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return proviceName == null ? "" : proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getPrviceceCode() {
        return prviceceCode;
    }

    public void setPrviceceCode(int prviceceCode) {
        this.prviceceCode = prviceceCode;
    }
}
