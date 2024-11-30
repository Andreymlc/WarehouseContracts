package com.example.WarehouseContracts.dto;

import com.example.WarehouseContracts.enums.Roles;

public record ResponseUserDto(
    String id,
    Roles role
) {}
