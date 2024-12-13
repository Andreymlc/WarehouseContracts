package com.example.WarehouseContracts.dto.forms.category;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;
import com.example.WarehouseContracts.dto.forms.base.PagesForm;

/**
 * Главная страница ADMIN. Отображает категории
 * <p>Возвращается в {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code 'home/admin/categories'}*/
public record CategorySearchForm(
    PagesForm pages,
    BaseForm base
) {
    public CategorySearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
