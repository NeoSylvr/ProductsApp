package com.back.payetonkawa.mapper;

import com.back.payetonkawa.dto.ProductsDto;
import com.back.payetonkawa.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProductMapper {

    //un mapping par champ du DTO
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "details", target = "details")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "color", target = "color")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "stock", target = "stock")
    public ProductsDto productToProductDto(Product product);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "details", target = "details")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "color", target = "color")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "stock", target = "stock")
    public Product productDtoToProduct(ProductsDto product);

}
