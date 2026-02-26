package com.eazybytes.eazystore.controller;


import com.eazybytes.eazystore.dto.ProductDto;
import com.eazybytes.eazystore.service.IproductService;
import com.eazybytes.eazystore.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//it tells which controller methods to execute
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor

public class ProductController {
    private final IproductService iproductService;

   @GetMapping
    public List<ProductDto> getProducts() {
        List<ProductDto> productList = iproductService.getProducts();
        return productList;
   }

}
