package com.example.WarehouseContracts.dto.forms.warehouse;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record WarehouseDeleteForm(
    PagesForm pages,
    BaseForm base
) {
    public WarehouseDeleteForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
