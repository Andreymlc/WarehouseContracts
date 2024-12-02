package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record ProductDeleteForm(
    PagesForm pages,
    BaseAdminForm base
) {
    public ProductDeleteForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
