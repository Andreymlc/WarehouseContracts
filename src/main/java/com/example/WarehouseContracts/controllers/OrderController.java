package com.example.WarehouseContracts.controllers;

import com.example.WarehouseContracts.dto.viewmodels.order.OrdersPageViewModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.WarehouseContracts.dto.forms.order.OrdersSearchForm;
import com.example.WarehouseContracts.dto.forms.purchase.PurchaseCreateForm;
import com.example.WarehouseContracts.dto.forms.order.OrderCreateForm;
import com.example.WarehouseContracts.dto.forms.purchase.PurchaseChangeStatusForm;

@RequestMapping("/orders")
public interface OrderController extends BaseController {

    /**
     * Returns: {@link OrdersPageViewModel OrdersPageViewModel} {@code 'orders.html'}
     * */
    @GetMapping
    String getOrders(@ModelAttribute("form") OrdersSearchForm form,
                     BindingResult bindingResult,
                     Model model);

    /**
     * Returns: redirect {@code '/orders'}
     * */
    @PostMapping("/change-status")
    String changeStatus(@ModelAttribute("form") PurchaseChangeStatusForm form,
                        BindingResult bindingResult,
                        Model model);

    /**
     * Returns: redirect {@link HomeController HomeController} {@code 'home/admin'}
     * */
    @PostMapping("/admin/create")
    String createAdminOrder(
            @Valid @ModelAttribute("form") OrderCreateForm form,
            BindingResult bindingResult,
            Model model);

    /**
     * Returns: redirect {@link HomeController HomeController} {@code 'home/user'}
     * */
    @PostMapping("/user/create")
    String createUserPurchase(
            @Valid @ModelAttribute("form") PurchaseCreateForm form,
            BindingResult bindingResult,
            Model model);

}
