package com.example.WarehouseContracts.controllers;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import com.example.WarehouseContracts.dto.forms.auth.LoginForm;
import com.example.WarehouseContracts.dto.forms.auth.RegisterForm;

@RequestMapping("/users")
public interface UserController {

    /**
     * Returns: {} {@code 'register.html'}
     * */
    @GetMapping("/register")
    String registerForm(Model model);

    /**
     * Error USER returns: {@code 'home-user.html'}
     * <p>Error ADMIN returns: {@code 'home-admin.html'}
     * <p>Returns (user): redirect {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code '/home'}
     * <p>Returns (admin): redirect {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code /home/admin}
    */
    @PostMapping("/register")
    String register(
            @Valid @ModelAttribute("form") RegisterForm form,
            BindingResult bindingResult,
            Model model
    );

    /**
     * Returns: {@code 'login.html'}
     * */
    @GetMapping("/login")
    String loginForm(Model model);

    /**
     * Error USER returns: {@code 'home-user.html'}
     * <p>Error ADMIN returns: {@code 'home-admin.html'}
     * <p>Returns (user): redirect {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code '/home'}
     * <p>Returns (admin): redirect {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code /home/admin}
     */
    @PostMapping("/login")
    String login(@ModelAttribute("form") LoginForm form, BindingResult bindingResult, Model model);

    /**
     * <p>Returns (admin): redirect {@link com.example.WarehouseContracts.controllers.HomeController HomeController} {@code /home/login}
     * */
    @PostMapping("/logout")
    String logout(@ModelAttribute("form") LoginForm form, BindingResult bindingResult, Model model);

}
