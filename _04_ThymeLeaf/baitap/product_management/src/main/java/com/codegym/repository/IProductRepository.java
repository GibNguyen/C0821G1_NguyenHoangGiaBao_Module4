package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showAll();
    public void saveProduct(Product product);
    public void deleteProduct(Product product);
}
