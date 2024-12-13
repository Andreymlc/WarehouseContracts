package com.example.WarehouseContracts.controllers;

import com.example.WarehouseContracts.dto.forms.base.BaseForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import com.example.WarehouseContracts.dto.forms.product.ProductMoveForm;
import com.example.WarehouseContracts.dto.forms.product.ProductSetMinMaxForm;
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
        @Valid @ModelAttribute("editForm") ProductSetMinMaxForm editForm,
        BindingResult bindingResult,
        Model model);

    @PostMapping("/{warehouseId}/set-maximum")
    String setMaximum(
        @PathVariable("warehouseId") String warehouseId,
        @Valid @ModelAttribute("maximum") ProductSetMinMaxForm editForm,
        BindingResult bindingResult,
        Model model);

    @GetMapping("/{warehouseId}/delete")
    String delete(
        @PathVariable("warehouseId") String warehouseId,
        @Valid @ModelAttribute("form") BaseForm form,
        BindingResult bindingResult);

}
