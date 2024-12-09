package com.example.WarehouseContracts.dto.forms.order;

import com.example.WarehouseContracts.dto.forms.base.BaseUserForm;

public record CreateOrderUserForm(
    BaseUserForm base,
    Integer pointsSpent
) {}
