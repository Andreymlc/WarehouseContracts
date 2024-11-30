package com.example.WarehouseContracts.dto.forms.auth;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterForm (
        @Email(message = "Некорректный E-mail")
        String email,
        boolean role,

        @NotBlank(message = "Имя пользователя не может быть пустым")
        String userName,

        @Size(min = 6, message = "Пароль должен быть длиной минимум 6 символов")
        String password,

        @Size(min = 6, message = "Пароль должен быть длиной минимум 6 символов")
        String confirmPassword
) {}
