package com.example.WarehouseContracts.dto;

public record AddStockDto(
    Integer quantity,
    String productId,
    String warehouseId,
    Integer minimumStock
) {}
