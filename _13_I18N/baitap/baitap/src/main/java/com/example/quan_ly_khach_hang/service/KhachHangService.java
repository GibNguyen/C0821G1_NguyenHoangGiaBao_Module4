package com.example.quan_ly_khach_hang.service;

import com.example.quan_ly_khach_hang.model.KhachHang;
import com.example.quan_ly_khach_hang.repository.IKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService implements IKhachHangService {
    @Autowired
    IKhachHangRepository iKhachHangRepository;
    @Override
    public List<KhachHang> showAll() {
        return iKhachHangRepository.findAll();
    }

    @Override
    public void save(KhachHang khachHang) {
        iKhachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang findById(int id) {
        return iKhachHangRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteKhachHang(KhachHang khachHang) {
        iKhachHangRepository.delete(khachHang);
    }
}
