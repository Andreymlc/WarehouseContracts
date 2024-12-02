package com.example.WarehouseContracts.dto.viewmodels.product;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;
import jakarta.validation.constraints.Min;

public record ProductSetMinimumForm(
    @Min(value = 0, message = "Запас должен быть положительным числом")
    Integer minimum,
    PagesForm pages,
    String productId,
    String warehouseId,
    BaseAdminForm base
) {
    public ProductSetMinimumForm {
            pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
