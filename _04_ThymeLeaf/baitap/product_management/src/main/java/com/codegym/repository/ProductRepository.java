package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone", 15.00, "Apple"));
        productList.add(new Product(2, "Galaxy", 20.00, "Samsung"));
        productList.add(new Product(3, "Redmi", 12.00, "Xiaomi"));
    }

    @Override
    public List<Product> showAll() {
        return productList;
    }

    @Override
    public void saveProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void deleteProductById(int id) {
        for (int i=0;i<showAll().size();i++) {
            if (id == showAll().get(i).getId()) {
                showAll().remove(i);
            }
        }
    }

    @Override
    public void editProductById(int id,String nameEdit,double priceEdit,String producerEdit) {
        for (int i=0;i<showAll().size();i++) {
            if (id == showAll().get(i).getId()){
                showAll().get(i).setName(nameEdit);
                showAll().get(i).setPrice(priceEdit);
                showAll().get(i).setProducer(producerEdit);
            }
        }
    }

    @Override
    public Product findByID(int id) {
        for (int i=0;i<showAll().size();i++) {
            if (id == showAll().get(i).getId()) {
                return showAll().get(i);
            }
        }
        return null;
    }
}
