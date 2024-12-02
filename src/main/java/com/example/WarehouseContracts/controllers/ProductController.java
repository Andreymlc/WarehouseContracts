package com.example.WarehouseContracts.controllers;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.example.WarehouseContracts.dto.forms.product.ProductMoveForm;
import com.example.WarehouseContracts.dto.forms.product.ProductDeleteForm;
import com.example.WarehouseContracts.dto.forms.product.ProductCreateForm;
import com.example.WarehouseContracts.dto.forms.category.CategorySetDiscountForm;
import com.example.WarehouseContracts.dto.viewmodels.product.ProductSetMinimumForm;

@RequestMapping("/product")
public interface ProductController extends BaseController {

    @PostMapping("/move")
    String move(
            @Valid @ModelAttribute("form") ProductMoveForm form,
            BindingResult bindingResult,
            Model model);

    @PostMapping("/set-minimum")
    String setMinimum(
            @Valid @ModelAttribute("form") ProductSetMinimumForm form,
            BindingResult bindingResult,
            Model model);

    @PostMapping("/create")
    String create(
            @Valid @ModelAttribute("create") ProductCreateForm create,
            BindingResult bindingResult,
            Model model);

    @GetMapping("/{id}/delete")
    String delete(
        @PathVariable("id") String id,
        @Valid @ModelAttribute("form") ProductDeleteForm form,
        BindingResult bindingResult);

    @PostMapping("/{categoryId}/set-discount")
    public String setDiscount(
        @PathVariable("categoryId") String categoryId,
        @Valid @ModelAttribute("discount") CategorySetDiscountForm discount,
        BindingResult bindingResult,
        Model model);

}
