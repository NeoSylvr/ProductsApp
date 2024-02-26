package com.back.payetonkawa.services.impl;

import com.back.payetonkawa.dto.ProductsDto;
import com.back.payetonkawa.mapper.ProductMapper;
import com.back.payetonkawa.model.Product;
import com.back.payetonkawa.repository.ProductRepository;
import com.back.payetonkawa.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductsServiceImpl implements ProductService {

    private ProductRepository productRepository;

    private ProductMapper productMapper;

    @Override
    public List<ProductsDto> getAllProducts() {
        List<ProductsDto> result = new ArrayList<>();
        this.productRepository.getAllProducts().forEach(
            product -> result.add(this.productMapper.productToProductDto(product))
        );
        return result;
    }

    @Override
    public ProductsDto getProductById(Long id) {
        return this.productMapper.productToProductDto(this.productRepository.getProductById(id));
    }

    @Override
    public ProductsDto addProduct(Product product) {
        Product productToAdd = new Product();

        productToAdd.setPrice(product.getPrice());
        productToAdd.setCreatedAt(product.getCreatedAt());
        productToAdd.setDetails(product.getDetails());
        productToAdd.setPrice(product.getPrice());
        productToAdd.setDescription(product.getDescription());
        productToAdd.setColor(product.getColor());
        productToAdd.setStock(product.getStock());

        return this.productMapper.productToProductDto(this.productRepository.addProduct(productToAdd));
    }

    @Override
    public ProductsDto updateProduct(Product product) {
        Product productToUpdate = this.productRepository.getProductById(product.getId());

        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setCreatedAt(product.getCreatedAt());
        productToUpdate.setDetails(product.getDetails());
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setDescription(product.getDescription());
        productToUpdate.setColor(product.getColor());
        productToUpdate.setStock(product.getStock());

        return this.productMapper.productToProductDto(this.productRepository.updateProduct(productToUpdate));
    }

    @Override
    public String deleteProduct(int id) {
        this.productRepository.deleteProduct(id);
        return "La suppression du produit a été effectuée!";
    }
}
