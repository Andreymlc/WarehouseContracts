package com.example.WarehouseContracts.dto.viewmodels.product;

import java.math.BigDecimal;

public record ProductViewModel (
    String id,
    String name,
    Float price,
    Float oldPrice,
    String category,
    Integer quantity
) {}
