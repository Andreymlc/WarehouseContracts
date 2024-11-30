package com.example.WarehouseContracts.dto.forms.cart;

public record CartUserForm(
    String role,
    String userName,
    Integer pointsCount
) {}
