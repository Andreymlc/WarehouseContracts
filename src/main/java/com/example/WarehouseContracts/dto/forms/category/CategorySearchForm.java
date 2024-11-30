package com.example.WarehouseContracts.dto.forms.category;

import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;
import com.example.WarehouseContracts.dto.forms.base.PagesForm;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

/**
 * Главная страница ADMIN. Отображает категории
 * <p>Возвращается в {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code 'home/admin/categories'}*/
public record CategorySearchForm(
    PagesForm pages,
    BaseAdminForm base
) {
    public CategorySearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}
