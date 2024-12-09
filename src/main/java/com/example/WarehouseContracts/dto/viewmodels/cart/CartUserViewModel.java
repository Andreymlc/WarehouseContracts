package com.example.WarehouseContracts.dto.viewmodels.cart;

import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;
import com.example.WarehouseContracts.dto.viewmodels.product.ProductInCartViewModel;

import java.util.List;

public record CartUserViewModel(
    Float totalPrice,
    Integer pointsCount,
    BasePagesViewModel base,
    List<ProductInCartViewModel> products
) {}
