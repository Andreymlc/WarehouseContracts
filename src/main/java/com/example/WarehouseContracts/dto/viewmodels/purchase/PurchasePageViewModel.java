package com.example.WarehouseContracts.dto.viewmodels.purchase;

import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;

import java.util.List;

public record PurchasePageViewModel(
    BasePagesViewModel base,
    List<PurchaseViewModel> purchases
) {
}
