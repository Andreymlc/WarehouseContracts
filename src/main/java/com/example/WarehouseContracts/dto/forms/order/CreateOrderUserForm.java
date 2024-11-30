package com.example.WarehouseContracts.dto.forms.order;

import com.example.WarehouseContracts.dto.forms.base.BaseUserForm;

import java.math.BigDecimal;

public record CreateOrderUserForm(
        BaseUserForm base,
        Integer pointsSpent,
        BigDecimal totalPrice
) {}
