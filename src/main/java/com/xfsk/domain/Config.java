package com.xfsk.domain;

public class Config {
    private String conName;

    private String conVal;

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName == null ? null : conName.trim();
    }

    public String getConVal() {
        return conVal;
    }

    public void setConVal(String conVal) {
        this.conVal = conVal == null ? null : conVal.trim();
    }
}