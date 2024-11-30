package com.example.WarehouseContracts.dto.forms.auth;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;

public record LoginForm (
        @NotBlank(message = "Имя пользователя не может быть пустым")
        String userName,

        @Size(min = 6, message = "Пароль должен быть длиной минимум 6 символов")
        String password
) {}

