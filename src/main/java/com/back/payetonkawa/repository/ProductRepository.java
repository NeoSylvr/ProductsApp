package com.back.payetonkawa.repository;

import com.payetonkafe.entity.model.Product;


import java.util.List;

public interface ProductRepository {

    public List<Product> getAllProducts();

    public Product getProductById(Long id);

    public Product addProduct(Product product);

    public Product updateProduct(Product product);

    public void deleteProduct(Long id);
}
