package com.example.thong_tin_bai_hat.service;

import com.example.thong_tin_bai_hat.dto.BaiHatDTO;
import com.example.thong_tin_bai_hat.model.BaiHat;
import com.example.thong_tin_bai_hat.repository.IBaiHatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaiHatService implements IBaiHatService {
    @Autowired
    IBaiHatRepository iBaiHatRepository;


    @Override
    public List<BaiHat> showList() {
        return iBaiHatRepository.findAll();
    }

    @Override
    public void createBaiHat(BaiHatDTO baiHatDTO) {
        BaiHat baiHat=new BaiHat(baiHatDTO.getId(),baiHatDTO.getTenBaiHat(),baiHatDTO.getNgheSi(),baiHatDTO.getTheLoaiNhac());
        iBaiHatRepository.save(baiHat);
    }

    @Override
    public BaiHat findBaiHatById(int id) {
        BaiHat baiHat=iBaiHatRepository.getById(id);
        return baiHat;
    }
}
