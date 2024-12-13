package com.example.WarehouseContracts.dto.viewmodels.order;

import java.time.LocalDateTime;

public record OrderViewModel(
    String number,
    Float totalPrice,
    LocalDateTime date
) {}
