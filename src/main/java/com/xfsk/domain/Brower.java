package com.xfsk.domain;

import java.util.Date;

public class Brower {
    private Integer broId;

    private String saleGuid;

    private Date broDatetime;

    private String broCode;

    private String broProUsername;

    private String broProSex;

    private String broProLocation;

    private Float broProLongitude;

    private Float broProLatitude;

    public Integer getBroId() {
        return broId;
    }

    public void setBroId(Integer broId) {
        this.broId = broId;
    }

    public String getSaleGuid() {
        return saleGuid;
    }

    public void setSaleGuid(String saleGuid) {
        this.saleGuid = saleGuid == null ? null : saleGuid.trim();
    }

    public Date getBroDatetime() {
        return broDatetime;
    }

    public void setBroDatetime(Date broDatetime) {
        this.broDatetime = broDatetime;
    }

    public String getBroCode() {
        return broCode;
    }

    public void setBroCode(String broCode) {
        this.broCode = broCode == null ? null : broCode.trim();
    }

    public String getBroProUsername() {
        return broProUsername;
    }

    public void setBroProUsername(String broProUsername) {
        this.broProUsername = broProUsername == null ? null : broProUsername.trim();
    }

    public String getBroProSex() {
        return broProSex;
    }

    public void setBroProSex(String broProSex) {
        this.broProSex = broProSex == null ? null : broProSex.trim();
    }

    public String getBroProLocation() {
        return broProLocation;
    }

    public void setBroProLocation(String broProLocation) {
        this.broProLocation = broProLocation == null ? null : broProLocation.trim();
    }

    public Float getBroProLongitude() {
        return broProLongitude;
    }

    public void setBroProLongitude(Float broProLongitude) {
        this.broProLongitude = broProLongitude;
    }

    public Float getBroProLatitude() {
        return broProLatitude;
    }

    public void setBroProLatitude(Float broProLatitude) {
        this.broProLatitude = broProLatitude;
    }
}