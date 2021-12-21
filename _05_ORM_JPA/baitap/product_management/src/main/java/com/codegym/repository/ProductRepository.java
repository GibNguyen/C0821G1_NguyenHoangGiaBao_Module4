package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {


    @Override
    public List<Product> showAll() {
        List<Product> productList = BaseRepository.entityManager.createQuery("select s from product s", Product.class).getResultList();
        return productList;
    }

    @Override
    public void saveProduct(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public void deleteProductById(int id) {
        for (int i = 0; i < showAll().size(); i++) {
            if (id == showAll().get(i).getId()) {
                showAll().remove(i);
            }
        }
    }

    @Override
    public void editProductById(int id, String nameEdit, double priceEdit, String producerEdit) {
        for (int i = 0; i < showAll().size(); i++) {
            if (id == showAll().get(i).getId()) {
                showAll().get(i).setName(nameEdit);
                showAll().get(i).setPrice(priceEdit);
                showAll().get(i).setProducer(producerEdit);
            }
        }
    }

    @Override
    public Product findByID(int id) {
        return BaseRepository.entityManager.find(Product.class,id);
    }
}
