package com.example.WarehouseContracts.controllers;

import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;

public interface BaseController {
    BasePagesViewModel createBaseViewModel(int totalPages, int countItemsInCart);
}
