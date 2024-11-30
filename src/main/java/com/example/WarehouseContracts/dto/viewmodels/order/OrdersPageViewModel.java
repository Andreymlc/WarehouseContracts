package com.example.WarehouseContracts.dto.viewmodels.order;

import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;

import java.util.List;

public record OrdersPageViewModel(
        BasePagesViewModel base,
        List<OrderViewModel> orders
) {}
