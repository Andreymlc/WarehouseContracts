package com.example.WarehouseContracts.dto.forms.category;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;

public record CategorySetDiscountForm(
    String name,
    Float discount,
    PagesForm pages
) {
    public CategorySetDiscountForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
