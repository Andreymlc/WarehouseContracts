package com.example.WarehouseContracts.dto.forms.base;

public record BaseUserForm(
    String id,
    String role,
    String userName,
    Integer pointsCount
) {}
