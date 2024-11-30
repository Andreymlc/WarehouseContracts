package com.example.WarehouseContracts.dto.forms.base;

import jakarta.validation.constraints.NotBlank;

public record BaseAdminForm(
    String id,
    String role,

    @NotBlank(message = "Имя пользователя не может быть пустым")
    String userName
) {
    public BaseAdminForm {
        role = role == null || role.isBlank() ? "admin" : role;
    }
}
