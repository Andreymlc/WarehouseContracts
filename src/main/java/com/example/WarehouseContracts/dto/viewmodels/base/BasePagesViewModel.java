package com.example.WarehouseContracts.dto.viewmodels.base;

/**
 * Базовая view модель Домашних страниц Админа и Пользователя
 * */
public record BasePagesViewModel(
    Integer totalPages,
    Integer countItemsInCart
) {}

