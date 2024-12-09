package com.example.WarehouseContracts.dto.forms.base;

public record PagesForm (
    Integer page,
    Integer size,
    String substring
) {
    public PagesForm {
         page = page != null ? page : 1;
         size = size != null ? size : 10;
         substring = substring == null || substring.isBlank() ? "" : substring;
    }
}
