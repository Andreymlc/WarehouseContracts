package com.example.WarehouseContracts.dto.forms.purchase;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;
import com.example.WarehouseContracts.dto.forms.base.PagesForm;

public record PurchaseChangeStatusForm(
    BaseForm base,
    PagesForm pages,
    String purchaseNumber
) {
    public PurchaseChangeStatusForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
