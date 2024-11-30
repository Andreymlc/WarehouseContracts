package com.example.WarehouseContracts.dto.forms.base;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record BaseUserForm(
    String id,
    String role,

    @NotBlank(message = "Имя пользователя не может быть пустым")
    String userName,

    @Min(value = 0, message = "Количество баллов должно быть положительным числом")
    Integer pointsCount
) {
    public BaseUserForm {
        role = role == null || role.isBlank() ? "user" : role;
    }
}
