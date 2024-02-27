package com.back.payetonkawa.services;

import com.back.payetonkawa.dto.ProductsDto;
import com.payetonkafe.entity.model.Product;

import java.util.List;

public interface ProductService {
    public List<ProductsDto> getAllProducts();

    public ProductsDto getProductById(Long id);

    public ProductsDto addProduct(ProductsDto product);

    public ProductsDto updateProduct(ProductsDto product);

    public String deleteProduct(Long id);
}
