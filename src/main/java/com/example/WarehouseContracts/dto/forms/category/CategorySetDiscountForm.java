package com.example.WarehouseContracts.dto.forms.category;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;

public record CategorySetDiscountForm(
    String id,

    @Min(value = 0, message = "Скидка должна быть положительной")
    @Max(value = 100, message = "Скидка не может быть больше 100")
    Integer discount,
    BaseAdminForm base
) {}
