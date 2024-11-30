package com.example.WarehouseContracts.dto.viewmodels.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderViewModel(
        String number,
        String status,
        LocalDateTime date,
        BigDecimal totalPrice
) {}
