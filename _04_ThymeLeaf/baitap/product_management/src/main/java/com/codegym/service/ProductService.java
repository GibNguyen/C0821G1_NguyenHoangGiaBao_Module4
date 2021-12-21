package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public List<Product> showAll() {
        return iProductRepository.showAll();
    }

    @Override
    public void saveProduct(Product product) {
        iProductRepository.saveProduct(product);
    }

    @Override
    public void deleteProductById(int id) {
        iProductRepository.deleteProductById(id);
    }

    @Override
    public void editProductById(int id, String nameEdit, double priceEdit, String producerEdit) {
        iProductRepository.editProductById(id,nameEdit,priceEdit,producerEdit);
    }

    @Override
    public Product findByID(int id) {
        return iProductRepository.findByID(id);
    }
}
