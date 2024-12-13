package com.example.WarehouseContracts.dto.forms.cart;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record AddProductToUserCartForm(
    String productId,
    BaseForm base
) {}
