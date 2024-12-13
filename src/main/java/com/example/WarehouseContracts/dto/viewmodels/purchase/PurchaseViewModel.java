package com.example.WarehouseContracts.dto.viewmodels.purchase;

import java.time.LocalDateTime;

public record PurchaseViewModel(
    String number,
    String status,
    Integer cashback,
    Float totalPrice,
    LocalDateTime date
) {
}
