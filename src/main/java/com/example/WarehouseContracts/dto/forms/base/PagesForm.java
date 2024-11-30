package com.example.WarehouseContracts.dto.forms.base;

import jakarta.validation.constraints.Min;

public record PagesForm(

        @Min(value = 0, message = "Страница должна быть больше 0")
        Integer page,

        @Min(value = 1, message = "Размер страницы должен быть больше 0")
        Integer size,

        String substring
) {
        public PagesForm {
                page = page != null ? page : 1;
                size = size != null ? size : 5;
                substring = substring == null || substring.isBlank() ? "" : substring;
        }
}
