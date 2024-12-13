package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record ProductEditForm(
    String id,
    String name,
    float price,
    String category,
    BaseForm base
) {}
