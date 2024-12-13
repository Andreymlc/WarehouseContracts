package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record ProductCreateForm(
    String name,
    Float price,
    String category,
    BaseForm base
) {}
