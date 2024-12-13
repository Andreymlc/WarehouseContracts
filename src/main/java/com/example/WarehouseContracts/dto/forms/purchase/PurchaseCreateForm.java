package com.example.WarehouseContracts.dto.forms.purchase;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;

public record PurchaseCreateForm(
    BaseForm base,
    Integer pointsSpent
) {
}
