package com.example.WarehouseContracts.dto.viewmodels.product;

import java.math.BigDecimal;

public record ProductViewModel (
    String id,
    String name,
    String category,
    Integer quantity,
    BigDecimal price,
    BigDecimal oldPrice
) {}
