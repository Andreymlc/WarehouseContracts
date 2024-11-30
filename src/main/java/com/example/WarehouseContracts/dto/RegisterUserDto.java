package com.example.WarehouseContracts.dto;

public record RegisterUserDto (
        String email,
        boolean role,
        String userName,
        String password,
        String confirmPassword
) {}
