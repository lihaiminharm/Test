package com.xfsk.domain;

import java.util.Date;

public class Promulgator {
    private String proId;

    private Date proDatetime;

    private String proUsername;

    private String proSex;

    private String proLocation;

    private Float proLongitude;

    private Float proLatitude;

    private Integer proLikeCount;

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

    public Date getProDatetime() {
        return proDatetime;
    }

    public void setProDatetime(Date proDatetime) {
        this.proDatetime = proDatetime;
    }

    public String getProUsername() {
        return proUsername;
    }

    public void setProUsername(String proUsername) {
        this.proUsername = proUsername == null ? null : proUsername.trim();
    }

    public String getProSex() {
        return proSex;
    }

    public void setProSex(String proSex) {
        this.proSex = proSex == null ? null : proSex.trim();
    }

    public String getProLocation() {
        return proLocation;
    }

    public void setProLocation(String proLocation) {
        this.proLocation = proLocation == null ? null : proLocation.trim();
    }

    public Float getProLongitude() {
        return proLongitude;
    }

    public void setProLongitude(Float proLongitude) {
        this.proLongitude = proLongitude;
    }

    public Float getProLatitude() {
        return proLatitude;
    }

    public void setProLatitude(Float proLatitude) {
        this.proLatitude = proLatitude;
    }

    public Integer getProLikeCount() {
        return proLikeCount;
    }

    public void setProLikeCount(Integer proLikeCount) {
        this.proLikeCount = proLikeCount;
    }
}