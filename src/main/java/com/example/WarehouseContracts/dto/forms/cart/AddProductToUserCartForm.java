package com.example.WarehouseContracts.dto.forms.cart;

import com.example.WarehouseContracts.dto.forms.base.BaseUserForm;

public record AddProductToUserCartForm(
    String productId,
    BaseUserForm base
) {}
