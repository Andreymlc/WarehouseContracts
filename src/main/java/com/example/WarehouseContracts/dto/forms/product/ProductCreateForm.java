package com.example.WarehouseContracts.dto.forms.product;

import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

import java.math.BigDecimal;

public record ProductCreateForm(
    String name,
    Float price,
    String category,
    BaseAdminForm base
) {}
