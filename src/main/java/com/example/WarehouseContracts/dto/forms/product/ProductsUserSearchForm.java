package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseUserForm;

public record ProductsUserSearchForm(
    String category,
    PagesForm pages,
    BaseUserForm base,
    boolean priceSort
) {
    public ProductsUserSearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
        category = category == null || category.isBlank() || category.equals("Все") ? "" : category;
    }
}
