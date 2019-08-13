package com.xfsk.domain;

import java.util.Date;

public class Sale {
    private String saleGuid;

    private String saleAddress;

    private String saleName;

    private Date saleDatetime;

    private Integer saleTel;

    private Integer saleIsexist;

    private Integer saleIsuse;

    public String getSaleGuid() {
        return saleGuid;
    }

    public void setSaleGuid(String saleGuid) {
        this.saleGuid = saleGuid == null ? null : saleGuid.trim();
    }

    public String getSaleAddress() {
        return saleAddress;
    }

    public void setSaleAddress(String saleAddress) {
        this.saleAddress = saleAddress == null ? null : saleAddress.trim();
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public Date getSaleDatetime() {
        return saleDatetime;
    }

    public void setSaleDatetime(Date saleDatetime) {
        this.saleDatetime = saleDatetime;
    }

    public Integer getSaleTel() {
        return saleTel;
    }

    public void setSaleTel(Integer saleTel) {
        this.saleTel = saleTel;
    }

    public Integer getSaleIsexist() {
        return saleIsexist;
    }

    public void setSaleIsexist(Integer saleIsexist) {
        this.saleIsexist = saleIsexist;
    }

    public Integer getSaleIsuse() {
        return saleIsuse;
    }

    public void setSaleIsuse(Integer saleIsuse) {
        this.saleIsuse = saleIsuse;
    }
}