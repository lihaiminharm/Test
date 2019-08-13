package com.xfsk.domain;

public class Type {
    private Integer typeId;

    private String typeGenre;

    private String typeItemCode;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeGenre() {
        return typeGenre;
    }

    public void setTypeGenre(String typeGenre) {
        this.typeGenre = typeGenre == null ? null : typeGenre.trim();
    }

    public String getTypeItemCode() {
        return typeItemCode;
    }

    public void setTypeItemCode(String typeItemCode) {
        this.typeItemCode = typeItemCode == null ? null : typeItemCode.trim();
    }
}