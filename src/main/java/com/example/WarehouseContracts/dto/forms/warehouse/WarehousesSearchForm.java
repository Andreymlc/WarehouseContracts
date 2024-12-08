package com.example.WarehouseContracts.dto.forms.warehouse;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record WarehousesSearchForm (
        PagesForm pages,
        BaseAdminForm base
) {
    public WarehousesSearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
