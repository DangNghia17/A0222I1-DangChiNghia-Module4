package com.nghia.controller;

import com.nghia.entity.Product;
import com.nghia.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping("/list")
    public ModelAndView list(Model model) {
        List<Product> productList = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("views/list");
        model.addAttribute("productList", productList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate(Model model) {
        ModelAndView modelAndView = new ModelAndView("views/create");
        model.addAttribute("product", new Product());
        return modelAndView;
    }

    @PostMapping("/create")
    public String addProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView  showFormEdit(@PathVariable("id") int id, Model model) {
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("views/edit");
        model.addAttribute("product", product);
        return modelAndView;
    }

    @PostMapping("edit")
    public String update(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "views/view";
    }

    @GetMapping("/delete/{id}")
    public String showFormDelete(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("product") Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("mess", "Removed product successfully!");
        return "redirect:/list";
    }

}
