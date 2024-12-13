package com.example.WarehouseContracts.dto.forms.warehouse;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record WarehouseCreateForm(
    String name,
    String location,
    BaseForm base
) {}
