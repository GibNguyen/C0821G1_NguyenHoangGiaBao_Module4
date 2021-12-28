package com.example.thong_tin_bai_hat.service;

import com.example.thong_tin_bai_hat.dto.BaiHatDTO;
import com.example.thong_tin_bai_hat.model.BaiHat;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IBaiHatService {
   public List<BaiHat> showList();

   public void createBaiHat(BaiHatDTO baiHatDTO);

   public BaiHat findBaiHatById(int id);
}
