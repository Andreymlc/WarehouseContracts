package com.example.WarehouseContracts.dto.forms.order;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record OrdersSearchForm(
    String status,
    PagesForm pages,
    boolean dateSort,
    BaseAdminForm base
) {
    public OrdersSearchForm {
        status = status == null || status.isBlank() ? "" : status;
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
