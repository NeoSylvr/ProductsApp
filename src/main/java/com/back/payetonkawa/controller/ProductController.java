package com.back.payetonkawa.controller;

import com.back.payetonkawa.controller.api.CustomersApiInterface;
import com.back.payetonkawa.dto.ProductsDto;
import com.back.payetonkawa.model.Product;
import com.back.payetonkawa.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products/")
@AllArgsConstructor
public class ProductController implements CustomersApiInterface {

    private ProductService productService;

    //récupérer tous les produits
    @GetMapping("getAllProducts")
    public ResponseEntity<List<ProductsDto>> getAllProducts() {
        return ResponseEntity.ok(this.productService.getAllProducts());
    }

    //récupérer un produit par son id
    @GetMapping("getProductById")
    public ResponseEntity<ProductsDto> getProductById(@RequestBody Long id) {
        return ResponseEntity.ok(this.productService.getProductById(id));
    }

    //ajouter un produit
    @GetMapping("addProduct")
    public ResponseEntity<ProductsDto> addProduct(@RequestBody ProductsDto product) {
        return ResponseEntity.ok(this.productService.addProduct(product));
    }

    //modifier un produit
    @GetMapping("updateProduct")
    public ResponseEntity<ProductsDto> updateProduct(@RequestBody ProductsDto product) {
        return ResponseEntity.ok(this.productService.updateProduct(product));
    }

    //supprimer un produit
    @GetMapping("deleteProduct")
    public ResponseEntity<String> deleteProduct(@RequestBody Long id) {
        return ResponseEntity.ok(this.productService.deleteProduct(id));
    }

}
