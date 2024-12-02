package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record ProductMoveForm(
    PagesForm pages,
    String productId,
    Integer countItems,
    BaseAdminForm base,
    String warehouseId,
    String newWarehouseId
) {
    public ProductMoveForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
