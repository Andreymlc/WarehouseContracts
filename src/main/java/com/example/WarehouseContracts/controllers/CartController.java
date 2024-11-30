package com.example.WarehouseContracts.controllers;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.WarehouseContracts.dto.forms.cart.CartUserForm;
import com.example.WarehouseContracts.dto.forms.cart.CartAdminForm;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/cart")
public interface CartController extends BaseController {

    /**
     * Returns: {@code 'user-cart.html'}
     * */
    @GetMapping("/user")
    String cartUserPage(
            @Valid @ModelAttribute("form") CartUserForm form,
            BindingResult bindingResult,
            Model model);

    /**
     * Returns: {@code 'admin-cart.html'}
     * */
    @GetMapping("/admin")
    String cartAdminPage(
            @Valid @ModelAttribute("form") CartAdminForm form,
            BindingResult bindingResult,
            Model model);

}
