package com.example.WarehouseContracts.dto.forms.order;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record OrderCreateForm(
    BaseForm base,
    String warehouseId
) {}
