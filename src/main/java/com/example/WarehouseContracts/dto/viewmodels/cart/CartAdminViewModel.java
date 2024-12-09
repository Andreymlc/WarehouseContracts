package com.example.WarehouseContracts.dto.viewmodels.cart;

import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;
import com.example.WarehouseContracts.dto.viewmodels.product.ProductInCartViewModel;

import java.util.List;

public record CartAdminViewModel(
    Float totalPrice,
    BasePagesViewModel base,
    List<ProductInCartViewModel> products
) {}
