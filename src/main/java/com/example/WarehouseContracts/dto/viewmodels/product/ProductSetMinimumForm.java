package com.example.WarehouseContracts.dto.viewmodels.product;

import jakarta.validation.constraints.Min;

public record ProductSetMinimumForm(
        String role,
        String userName,
        Integer minimum,
        String productName,
        String warehouseName,

        @Min(value = 0, message = "Страница должна быть больше 0")
        Integer page,

        @Min(value = 1, message = "Размер страницы должен быть больше 0")
        Integer size,

        String substring
) {}
