package com.nghia.controller;

import com.nghia.model.User;
import com.nghia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class FormController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String home(Model model) {
        model.addAttribute("userList", userService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "create";
    }

    @PostMapping("/create")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult bindingResult ,
                       RedirectAttributes redirectAttributes) {
        new User().validate(user, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "create";
        }
        userService.save(user);
        redirectAttributes.addFlashAttribute("success","Add new user successfully!!");
        return "redirect:/list";
    }
}
