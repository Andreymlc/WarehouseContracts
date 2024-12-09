package com.example.WarehouseContracts.dto.forms.category;

import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record CategoryCreateForm(
    String name,
    Integer discount,
    BaseAdminForm base
) {}
