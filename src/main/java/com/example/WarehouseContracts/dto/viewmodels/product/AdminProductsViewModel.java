package com.example.WarehouseContracts.dto.viewmodels.product;

import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;

import java.util.List;

/**
 * Главная страница ADMIN. Отображает продукты
 * <p>Возвращается в {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code 'home/admin/products'}*/
public record AdminProductsViewModel(
        BasePagesViewModel base,
        List<String> categories,
        List<ProductViewModel> products
) {}
