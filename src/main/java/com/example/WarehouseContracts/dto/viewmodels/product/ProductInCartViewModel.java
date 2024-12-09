package com.example.WarehouseContracts.dto.viewmodels.product;

public record ProductInCartViewModel(
    String id,
    String name,
    String category,
    Integer quantity,
    Float totalPrice
) {}
