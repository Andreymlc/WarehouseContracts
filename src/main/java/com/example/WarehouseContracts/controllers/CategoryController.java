package com.example.WarehouseContracts.controllers;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.WarehouseContracts.dto.forms.category.CategoryCreateForm;
import com.example.WarehouseContracts.dto.forms.category.CategorySetDiscountForm;

@RequestMapping("/category")
public interface CategoryController extends BaseController {

    @PostMapping("/create")
    String create(
            @Valid @ModelAttribute("form") CategoryCreateForm form,
            BindingResult bindingResult,
            Model model);

    @PostMapping("/set-discount")
    String setDiscount(
            @Valid @ModelAttribute("form") CategorySetDiscountForm form,
            BindingResult bindingResult,
            Model model);
}
