package com.example.WarehouseContracts.dto;

import java.math.BigDecimal;

public record ProductDto (
    String id,
    String name,
    String category,
    BigDecimal price,
    Integer quantity,
    BigDecimal oldPrice
) {}
