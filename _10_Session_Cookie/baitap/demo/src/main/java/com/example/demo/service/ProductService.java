package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

    @Service
    public class ProductService implements IProductService {
        @Autowired
        IProductRepository productRepository;

        @Override
        public Page<Product> findAll(PageRequest of) {
            return productRepository.findAll(of);
        }

        @Override
        public Product findById(Integer id) {
            return productRepository.getById(id);
        }
    }

