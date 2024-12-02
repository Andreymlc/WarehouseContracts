package com.example.WarehouseContracts.dto.forms.warehouse;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record WarehouseDeleteForm(
    PagesForm pages,
    BaseAdminForm base
) {
    public WarehouseDeleteForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
