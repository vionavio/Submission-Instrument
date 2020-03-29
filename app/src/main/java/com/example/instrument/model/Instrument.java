package com.example.instrument.model;

public class Instrument {
    private  String name;
    private String detail;
    private String penemu;
    private String tahun;
    private String tempat;
    private int photo;

    public String getPenemu() {
        return penemu;
    }

    public void setPenemu(String penemu) {
        this.penemu = penemu;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
