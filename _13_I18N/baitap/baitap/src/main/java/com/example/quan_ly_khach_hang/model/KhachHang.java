package com.example.quan_ly_khach_hang.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KhachHang {
    @Id
    private int id;
    @Column(name = "ten")
    private String tenKH;
    @Column(name = "ngay_sinh")
    private String ngaySinh;
    @Column(name="so_dien_thoai")
    private String soDienThoai;

    public KhachHang() {
    }

    public KhachHang(int id, String tenKH, String ngaySinh, String soDienThoai) {
        this.id = id;
        this.tenKH = tenKH;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
