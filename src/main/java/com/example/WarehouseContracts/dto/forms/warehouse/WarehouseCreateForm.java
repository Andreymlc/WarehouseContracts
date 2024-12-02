package com.example.WarehouseContracts.dto.forms.warehouse;

import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record WarehouseCreateForm(
    String name,
    String location,
    BaseAdminForm base
) {}
