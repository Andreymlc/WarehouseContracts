package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record ProductEditForm(
    String id,
    String name,
    float price,
    String category,
    BaseAdminForm base
) {}
