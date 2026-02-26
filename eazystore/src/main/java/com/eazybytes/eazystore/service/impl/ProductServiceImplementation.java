package com.eazybytes.eazystore.service.impl;

import com.eazybytes.eazystore.dto.ProductDto;
import com.eazybytes.eazystore.repository.ProductRepository;
import com.eazybytes.eazystore.service.IproductService;
import com.eazybytes.eazystore.entity.Product;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductServiceImplementation implements IproductService {
    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> getProducts() {
        return productRepository.findAll().stream().map(product -> toDto(product)).collect(Collectors.toList());
    }

    public ProductDto toDto(Product product){
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

}
