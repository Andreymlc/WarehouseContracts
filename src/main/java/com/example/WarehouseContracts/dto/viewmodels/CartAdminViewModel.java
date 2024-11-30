package com.example.WarehouseContracts.dto.viewmodels;

import com.example.WarehouseContracts.dto.ProductDto;
import com.example.WarehouseContracts.dto.viewmodels.base.BasePagesViewModel;

import java.util.List;
import java.math.BigDecimal;

public record CartAdminViewModel(
        BasePagesViewModel base,
        BigDecimal totalPrice,
        List<ProductDto> products
) {}
