package com.example.thong_tin_bai_hat.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class BaiHatDTO {

    public int id;

    @NotNull(message = "Tên không được để trống")
    @NotEmpty(message = "Tên không được để trống")
    @NotBlank(message = "Tên không được để trống")
    public String tenBaiHat;

    @NotNull(message = "Tên không được để trống")
    @NotEmpty(message = "Tên không được để trống")
    @NotBlank(message = "Tên không được để trống")
    public String ngheSi;

    @NotNull(message = "Tên không được để trống")
    @NotEmpty(message = "Tên không được để trống")
    @NotBlank(message = "Tên không được để trống")
    public String theLoaiNhac;

    public BaiHatDTO() {
    }

    public BaiHatDTO(int id, String tenBaiHat, String ngheSi, String theLoaiNhac) {
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
