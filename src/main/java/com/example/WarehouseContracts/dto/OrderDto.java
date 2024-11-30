package com.example.WarehouseContracts.dto;

import com.example.WarehouseContracts.enums.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderDto(
    String number,
    Status status,
    LocalDateTime date,
    BigDecimal totalPrice
) {}
