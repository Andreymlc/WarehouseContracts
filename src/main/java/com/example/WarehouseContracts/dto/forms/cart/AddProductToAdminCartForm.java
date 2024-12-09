package com.example.WarehouseContracts.dto.forms.cart;

import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record AddProductToAdminCartForm(
    String productId,
    BaseAdminForm base
) {}
