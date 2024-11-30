package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record ProductsAdminSearchForm(
    String category,
    PagesForm pages,
    boolean priceSort,
    BaseAdminForm base
) {
    public ProductsAdminSearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
        category = category == null || category.isBlank() || category.equals("Все") ? "" : category;
    }
}
