package com.nghia.controller;

import com.nghia.model.Blog;
import com.nghia.service.IBlogService;
import com.nghia.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;

    @ModelAttribute("blog")
    public Blog initProduct() {
        return new Blog();
    }


    @GetMapping("/list")
    public String showList(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
        model.addAttribute("blogList", blogService.findAll(PageRequest.of(page, 5, Sort.by("year").descending())));
        return "views/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("category", categoryService.findAll());
        return "views/create";
    }

    @PostMapping("/save")
    public String saveBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("success", "Created new blog successfully!!");
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String viewEdit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("category", categoryService.findAll());
        return "views/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("success", "Edit product successfully!!!");
        return "redirect:/list";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("category", categoryService.findAll());
        return "views/view";
    }
    @GetMapping("/delete/{id}")
    public String deleteForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("category", categoryService.findAll());
        return "views/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.delete(blog.getId());
        redirectAttributes.addFlashAttribute("success", "Delete product successfully!!!");
        return "redirect:/list";
    }

    @GetMapping("/list/search")
    public String search(@RequestParam("nameSearch") String name,
                         @RequestParam(value = "page", defaultValue = "0") int page,
                         Model model) {
        Page<Blog> blog = blogService.seachByName(name, PageRequest.of(page, 4));
        model.addAttribute("nameSearch", name);
        model.addAttribute("blogList", blog);
        if (blog.isEmpty()){
            return "views/404";
        }
        return "views/list";
    }


}
