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
import com.example.WarehouseContracts.dto.forms.order.CreateOrderUserForm;
import com.example.WarehouseContracts.dto.forms.order.CreateOrderAdminForm;
import com.example.WarehouseContracts.dto.forms.order.ChangeOrderStatusForm;

@RequestMapping("/orders")
public interface OrderController extends BaseController {

    /**
     * Returns: {@link OrdersPageViewModel OrdersPageViewModel} {@code 'orders.html'}
     * */
    @GetMapping
    String ordersPage(@ModelAttribute("form") OrdersSearchForm form,
                     BindingResult bindingResult,
                     Model model);

    /**
     * Returns: redirect {@code '/orders'}
     * */
    @PostMapping("/change-status")
    String changeStatus(@ModelAttribute("form") ChangeOrderStatusForm form,
                        BindingResult bindingResult,
                        Model model);

    /**
     * Returns: redirect {@link HomeController HomeController} {@code 'home/admin'}
     * */
    @PostMapping("/admin/create-order")
    String createAdminOrder(
            @Valid @ModelAttribute("form") CreateOrderAdminForm form,
            BindingResult bindingResult,
            Model model);

    /**
     * Returns: redirect {@link HomeController HomeController} {@code 'home/user'}
     * */
    @PostMapping("/user/create-order")
    String createUserOrder(
            @Valid @ModelAttribute("form") CreateOrderUserForm form,
            BindingResult bindingResult,
            Model model);

}
