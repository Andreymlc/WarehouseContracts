package com.example.WarehouseContracts.dto.viewmodels;

import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;
import com.example.WarehouseContracts.dto.viewmodels.product.ProductViewModel;

import java.util.List;

public record WarehousePageViewModel(
    BasePagesViewModel base,
    List<ProductViewModel> products
) {}
