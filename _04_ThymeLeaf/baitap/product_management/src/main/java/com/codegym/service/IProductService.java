package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showAll();
    public void saveProduct(Product product);
    public void deleteProduct(Product product);
}
