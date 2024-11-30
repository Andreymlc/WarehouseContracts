package com.example.WarehouseContracts.dto.forms.category;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;

public record CategoryCreateForm(
    String name,
    Float discount,
    PagesForm pages
) {
    public CategoryCreateForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
