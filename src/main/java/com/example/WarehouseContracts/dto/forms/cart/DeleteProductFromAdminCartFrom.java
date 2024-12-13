package com.example.WarehouseContracts.dto.forms.cart;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record DeleteProductFromAdminCartFrom(
    String productId,
    BaseForm base
) {}
