package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {
    Page<Product> findAll(PageRequest of);

    Product findById(Integer id);
}
