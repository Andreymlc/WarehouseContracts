package com.example.WarehouseContracts.dto.forms.order;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record OrdersSearchForm(
    BaseForm base,
    PagesForm pages
) {
    public OrdersSearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
