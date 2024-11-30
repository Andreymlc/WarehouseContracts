package com.example.WarehouseContracts.dto.forms.order;

import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

import java.math.BigDecimal;

public record CreateOrderAdminForm(
        BaseAdminForm base,
        BigDecimal totalPrice
) {}
