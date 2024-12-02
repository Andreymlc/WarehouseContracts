package com.example.WarehouseContracts.controllers;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import com.example.WarehouseContracts.dto.forms.product.ProductMoveForm;
import com.example.WarehouseContracts.dto.forms.warehouse.WarehouseDeleteForm;
import com.example.WarehouseContracts.dto.viewmodels.product.ProductSetMinimumForm;
import com.example.WarehouseContracts.dto.forms.product.ProductWarehouseSearchForm;

@RequestMapping("/warehouses")
public interface WarehouseController extends BaseController {

    @GetMapping("/{warehouseId}/manage")
    String showManagePage(
        @PathVariable("warehouseId") String warehouseId,
        @ModelAttribute("form") ProductWarehouseSearchForm form,
        Model model);

    @PostMapping("/{warehouseId}/move")
    String move(
        @PathVariable("warehouseId") String warehouseId,
        @Valid @ModelAttribute("form") ProductMoveForm form,
        BindingResult bindingResult,
        Model model);

    @PostMapping("/{warehouseId}/set-minimum")
    String setMinimum(
        @PathVariable("warehouseId") String warehouseId,
        @Valid @ModelAttribute("editForm") ProductSetMinimumForm editForm,
        BindingResult bindingResult,
        Model model);

    @GetMapping("/{warehouseId}/delete")
    String delete(
        @PathVariable("warehouseId") String warehouseId,
        @Valid @ModelAttribute("form") WarehouseDeleteForm form,
        BindingResult bindingResult);

}
