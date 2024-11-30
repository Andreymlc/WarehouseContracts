package com.example.WarehouseContracts.dto.viewmodels.home;

import com.example.WarehouseContracts.dto.viewmodels.order.OrderViewModel;
import com.example.WarehouseContracts.dto.viewmodels.CategoryViewModel;
import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;

import java.util.List;

public record HomeAdminCategoriesViewModel(
        BasePagesViewModel base,
        List<CategoryViewModel> categories
) {}
