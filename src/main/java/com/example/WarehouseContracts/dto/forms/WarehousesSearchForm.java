package com.example.WarehouseContracts.dto.forms;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record WarehousesSearchForm (
        BaseAdminForm base,
        PagesForm pages
) {
    public WarehousesSearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
