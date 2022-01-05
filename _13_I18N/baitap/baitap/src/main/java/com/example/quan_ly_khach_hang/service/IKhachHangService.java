package com.example.quan_ly_khach_hang.service;

import com.example.quan_ly_khach_hang.model.KhachHang;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IKhachHangService  {
    public List<KhachHang> showAll();
    void save(KhachHang khachHang);
    KhachHang findById(int id);
    void deleteKhachHang(KhachHang khachHang);
}
