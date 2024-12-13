package com.example.WarehouseContracts.dto.forms.warehouse;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record WarehousesSearchForm (
        PagesForm pages,
        BaseForm base
) {
    public WarehousesSearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
