package com.example.WarehouseContracts.dto.viewmodels.home;

import com.example.WarehouseContracts.dto.viewmodels.product.ProductViewModel;
import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;

import java.util.List;
import java.util.Set;

/**
 * Главная страница USER
 * Возвращается в {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code '/home/user'}*/
public record HomeUserViewModel(
        Integer pointsCount,
        BasePagesViewModel base,
        List<String> categories,
        List<ProductViewModel> products
) {}
