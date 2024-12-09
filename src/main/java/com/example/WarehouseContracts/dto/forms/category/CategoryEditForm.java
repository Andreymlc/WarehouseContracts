package com.example.WarehouseContracts.dto.forms.category;

import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record CategoryEditForm(
    String id,
    String name,
    Integer discount,
    BaseAdminForm base
) {}
