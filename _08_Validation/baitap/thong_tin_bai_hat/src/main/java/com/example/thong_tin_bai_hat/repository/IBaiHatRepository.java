package com.example.thong_tin_bai_hat.repository;

import com.example.thong_tin_bai_hat.model.BaiHat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBaiHatRepository extends JpaRepository<BaiHat,Integer> {
}
