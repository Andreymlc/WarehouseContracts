package com.example.WarehouseContracts.dto.viewmodels.home;

import com.example.WarehouseContracts.dto.viewmodels.order.OrderViewModel;
import com.example.WarehouseContracts.dto.viewmodels.WarehouseViewModel;
import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;

import java.util.List;

/**
 * Главная страница ADMIN. Отображает склады
 * <p>Возвращается в {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code '/home/admin'}*/
public record HomeAdminViewModel(
        BasePagesViewModel base,
        List<WarehouseViewModel> warehouses
) {}
