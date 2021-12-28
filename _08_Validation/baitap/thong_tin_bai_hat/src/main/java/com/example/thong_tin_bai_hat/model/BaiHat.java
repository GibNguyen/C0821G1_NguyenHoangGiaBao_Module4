package com.example.thong_tin_bai_hat.model;

import javax.persistence.*;

@Entity
public class BaiHat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "ten_bai_hat")
    private String tenBaiHat;
    @Column(name = "nghe_si")
    private String ngheSi;
    @Column(name = "the_loai_nhac")
    private String theLoaiNhac;

    public BaiHat() {
    }

    public BaiHat(int id, String tenBaiHat, String ngheSi, String theLoaiNhac) {
        this.id = id;
        this.tenBaiHat = tenBaiHat;
        this.ngheSi = ngheSi;
        this.theLoaiNhac = theLoaiNhac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getNgheSi() {
        return ngheSi;
    }

    public void setNgheSi(String ngheSi) {
        this.ngheSi = ngheSi;
    }

    public String getTheLoaiNhac() {
        return theLoaiNhac;
    }

    public void setTheLoaiNhac(String theLoaiNhac) {
        this.theLoaiNhac = theLoaiNhac;
    }
}
