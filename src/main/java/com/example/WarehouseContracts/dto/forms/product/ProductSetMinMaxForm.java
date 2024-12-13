package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseForm;
import jakarta.validation.constraints.Min;

public record ProductSetMinMaxForm(
    @Min(value = 0, message = "Запас должен быть положительным числом")
    Integer value,
    PagesForm pages,
    String productId,
    String warehouseId,
    BaseForm base
) {
    public ProductSetMinMaxForm {
            pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
