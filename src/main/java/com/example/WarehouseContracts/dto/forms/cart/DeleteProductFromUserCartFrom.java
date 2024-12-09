package com.example.WarehouseContracts.dto.forms.cart;

import com.example.WarehouseContracts.dto.forms.base.BaseUserForm;

public record DeleteProductFromUserCartFrom(
    String productId,
    BaseUserForm base
) {}
