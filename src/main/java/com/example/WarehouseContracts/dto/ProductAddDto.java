package com.example.WarehouseContracts.dto;

import java.math.BigDecimal;

public record ProductAddDto(
    String name,
    String category,
    BigDecimal price
) {}
