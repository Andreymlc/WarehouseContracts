package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;
import com.example.WarehouseContracts.dto.forms.base.PagesForm;

public record ProductWarehouseSearchForm(
    String category,
    PagesForm pages,
    String warehouseId,
    BaseForm base
) {
    public ProductWarehouseSearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
        category = category == null || category.isBlank() || category.equals("Все") ? "" : category;
    }
}
