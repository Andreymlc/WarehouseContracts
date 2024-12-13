package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;
import com.example.WarehouseContracts.dto.forms.base.PagesForm;

public record ProductsUserSearchForm(
    String category,
    PagesForm pages,
    BaseForm base,
    boolean priceSort
) {
    public ProductsUserSearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
        category = category == null || category.isBlank() || category.equals("Все") ? "" : category;
    }
}
