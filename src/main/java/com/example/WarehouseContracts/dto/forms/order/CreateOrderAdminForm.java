package com.example.WarehouseContracts.dto.forms.order;

import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record CreateOrderAdminForm(
        Float totalPrice,
        BaseAdminForm base
) {}
