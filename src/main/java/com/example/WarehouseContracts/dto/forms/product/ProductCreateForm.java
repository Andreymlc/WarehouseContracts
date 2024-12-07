package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;
import com.example.WarehouseContracts.dto.forms.base.PagesForm;

import java.math.BigDecimal;

public record ProductCreateForm(
    String name,
    PagesForm pages,
    String category,
    BigDecimal price,
    BaseAdminForm base
) {
    public ProductCreateForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
