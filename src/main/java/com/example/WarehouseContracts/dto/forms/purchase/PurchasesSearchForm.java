package com.example.WarehouseContracts.dto.forms.purchase;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;
import com.example.WarehouseContracts.dto.forms.base.PagesForm;

public record PurchasesSearchForm(
    BaseForm base,
    PagesForm pages
) {
    public PurchasesSearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
