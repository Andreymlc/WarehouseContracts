package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record MoveProductForm(
    PagesForm pages,
    BaseAdminForm base,
    String productName,
    String newWarehouse
) {
    public MoveProductForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
