package com.example.WarehouseContracts.controllers;

import com.example.WarehouseContracts.dto.forms.product.ProductEditForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import com.example.WarehouseContracts.dto.forms.base.BaseAdminForm;
import com.example.WarehouseContracts.dto.forms.category.CategoryEditForm;
import com.example.WarehouseContracts.dto.forms.product.ProductCreateForm;
import com.example.WarehouseContracts.dto.forms.category.CategoryCreateForm;
import com.example.WarehouseContracts.dto.forms.category.CategorySetDiscountForm;

@RequestMapping("/catalog")
public interface CatalogController extends BaseController {

    @PostMapping("/products/create")
    String createProduct(
        @Valid @ModelAttribute("createProduct") ProductCreateForm create,
        BindingResult bindingResult,
        Model model);

    @GetMapping("/products/{productId}/delete")
    String deleteProduct(
        @PathVariable("productId") String productId,
        @Valid @ModelAttribute("form") BaseAdminForm form,
        BindingResult bindingResult);

    @GetMapping("/products/{productId}/edit")
    String showEditProduct(
        @PathVariable("productId") String categoryId,
        @Valid @ModelAttribute("edit") ProductEditForm form,
        Model model);

    @PostMapping("/products/{productId}/edit")
    String editProduct(
        @PathVariable("productId") String productId,
        @Valid @ModelAttribute("edit") ProductEditForm form,
        BindingResult bindingResult);

    @PostMapping("/categories/create")
    String createCategory(
        @Valid @ModelAttribute("create") CategoryCreateForm create,
        BindingResult bindingResult,
        Model model);

    @GetMapping("/categories/{categoryId}/delete")
    String deleteCategory(
        @PathVariable("categoryId") String categoryId,
        @Valid @ModelAttribute("form") BaseAdminForm form,
        BindingResult bindingResult);

    @GetMapping("/categories/{categoryId}/edit")
    String showEditCategory(
        @PathVariable("categoryId") String categoryId,
        @Valid @ModelAttribute("edit") CategoryEditForm form,
        Model model);

    @PostMapping("/categories/{categoryId}/edit")
    String editCategory(
        @PathVariable("categoryId") String categoryId,
        @Valid @ModelAttribute("edit") CategoryEditForm edit,
        BindingResult bindingResult);

}
