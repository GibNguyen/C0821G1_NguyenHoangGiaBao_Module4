package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showAll();
    public void saveProduct(Product product);
    public void deleteProductById(int id);
    public void editProductById(int id,String nameEdit,double priceEdit,String producerEdit);
    public Product findByID(int id);
}
