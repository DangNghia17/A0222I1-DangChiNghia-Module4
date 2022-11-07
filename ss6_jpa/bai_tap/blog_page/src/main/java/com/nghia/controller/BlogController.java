package com.nghia.controller;

import com.nghia.model.Blog;
import com.nghia.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;

    @ModelAttribute("blog")
    public Blog initProduct() {
        return new Blog();
    }


    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "views/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "views/create";
    }

    @PostMapping("/save")
    public String saveBlog(@ModelAttribute("blog") Blog blog , RedirectAttributes redirectAttributes){
    blogService.create(blog);
    redirectAttributes.addFlashAttribute("success", "Created new blog successfully!!");
    return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String viewEdit(@PathVariable("id")Integer id, Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "views/edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog")Blog blog , RedirectAttributes redirectAttributes){
        blogService.update(blog);
        redirectAttributes.addFlashAttribute("success", "Edit product successfully!!!");
        return "redirect:/list";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("blog",blogService.findById(id));
        return "views/view";
    }

    @GetMapping("/delete/{id}")
    public String deleteForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "views/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.delete(blog.getId());
        redirectAttributes.addFlashAttribute("success", "Delete product successfully!!!");
        return "redirect:/list";
    }
    @GetMapping("/list/search")
    public String search(@RequestParam("nameSearch") String name, Model model) {
        List<Blog> blog = blogService.searchByName(name);
        model.addAttribute("nameSearch", name);
        model.addAttribute("blogList", blog);
        return "views/list";
    }

}
