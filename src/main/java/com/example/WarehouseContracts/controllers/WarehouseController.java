package com.example.WarehouseContracts.controllers;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.WarehouseContracts.dto.forms.WarehousesSearchForm;

@RequestMapping("/warehouses")
public interface WarehouseController extends BaseController {

    @GetMapping
    String warehousePage(
            @Valid @ModelAttribute("form") WarehousesSearchForm form,
            BindingResult bindingResult,
            Model model);

    @GetMapping("/{id}")
    String getWarehouse(
        @PathVariable String id,
        Model model);
}
