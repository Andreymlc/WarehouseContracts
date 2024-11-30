package com.example.WarehouseContracts.dto.viewmodels.home;

import com.example.WarehouseContracts.dto.viewmodels.order.OrderViewModel;
import com.example.WarehouseContracts.dto.viewmodels.product.ProductViewModel;
import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;

import java.util.List;

/**
 * Главная страница USER
 * Возвращается в {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code '/home/user'}*/
public record HomeUserViewModel(
        BasePagesViewModel base,
        Integer pointsCount,
        List<String> categories,
        List<ProductViewModel> products
) {}
