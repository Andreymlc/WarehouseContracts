package com.example.WarehouseContracts.dto.forms.order;

import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record ChangeOrderStatusForm(
    PagesForm pages,
    String newStatus,
    BaseAdminForm base,
    String orderNumber
) {
    public ChangeOrderStatusForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
