package com.back.payetonkawa.repository.impl;

import com.back.payetonkawa.model.Product;
import com.back.payetonkawa.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    public List<Product> getAllProducts() {
        return this.getAllProducts();
    }

    public Product getProductById(Long id) {
        return this.getProductById(id);
    }

    public Product addProduct(Product product) {
        return this.addProduct(product);
    }

    public Product updateProduct(Product product) {
        return this.updateProduct(product);
    }

    public void deleteProduct(int id) {
        this.deleteProduct(id);
    }
}
