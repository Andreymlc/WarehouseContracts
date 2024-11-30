package com.example.WarehouseContracts.dto.viewmodels.home;

import com.example.WarehouseContracts.dto.viewmodels.order.OrderViewModel;
import com.example.WarehouseContracts.dto.viewmodels.product.ProductViewModel;
import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;

import java.util.List;

/**
 * Главная страница ADMIN. Отображает продукты
 * <p>Возвращается в {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code 'home/admin/products'}*/
public record HomeAdminProductsViewModel(
        BasePagesViewModel base,
        List<String> categories,
        List<ProductViewModel> products
) {}
