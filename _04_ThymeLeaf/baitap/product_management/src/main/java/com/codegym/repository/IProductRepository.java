package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showAll();
    public void saveProduct(Product product);
    public void deleteProductById(int id);
    public void editProductById(int id,String nameEdit,double priceEdit,String producerEdit);
    public Product findByID(int id);
}
