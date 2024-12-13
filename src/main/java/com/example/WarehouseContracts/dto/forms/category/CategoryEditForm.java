package com.example.WarehouseContracts.dto.forms.category;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record CategoryEditForm(
    String id,
    String name,
    Integer discount,
    BaseForm base
) {}
