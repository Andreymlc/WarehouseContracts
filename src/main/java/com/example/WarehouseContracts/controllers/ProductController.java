package com.example.WarehouseContracts.controllers;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.WarehouseContracts.dto.forms.product.MoveProductForm;
import com.example.WarehouseContracts.dto.forms.product.ProductCreateForm;
import com.example.WarehouseContracts.dto.viewmodels.product.ProductSetMinimumForm;

@RequestMapping("/product")
public interface ProductController extends BaseController {

    @PostMapping("/move")
    String move(
            @Valid @ModelAttribute("form") MoveProductForm form,
            BindingResult bindingResult,
            Model model);

    @PostMapping("/set-minimum")
    String setMinimum(
            @Valid @ModelAttribute("form") ProductSetMinimumForm form,
            BindingResult bindingResult,
            Model model);

    @PostMapping("/create")
    String create(
            @Valid @ModelAttribute("form") ProductCreateForm form,
            BindingResult bindingResult,
            Model model);
}
