package com.example.WarehouseContracts.dto.forms.category;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record CategoryCreateForm(
    String name,
    Integer discount,
    BaseForm base
) {}
