package com.eazybytes.eazystore.dto;



import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
@Getter
@Setter
@RequiredArgsConstructor
public class ProductDto {
    private Long productId;
    private String productName;
    private String description;
    private BigDecimal price;
    private Integer popularity;
    private String imageURl;
    private Instant createdAt;
}
