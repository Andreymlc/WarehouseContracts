package com.example.WarehouseContracts.dto.forms.cart;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record DeleteProductFromUserCartFrom(
    String productId,
    BaseForm base
) {}
