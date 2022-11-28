package com.nghia.controller;

import com.nghia.model.QuestionContent;
import com.nghia.model.QuestionType;
import com.nghia.service.IQuestionContentService;
import com.nghia.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class QuestionController {
    @Autowired
    IQuestionContentService questionContentService;
    @Autowired
    IQuestionTypeService questionTypeService;

    @ModelAttribute("questionContent")
    public QuestionContent init() {
        return new QuestionContent();
    }

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
        model.addAttribute("questionContentList", questionContentService.findAll(PageRequest.of(page, 5, Sort.by("status").and(Sort.by("dateCreate")))));
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("questionContent", new QuestionContent());
        model.addAttribute("questionType", questionTypeService.findAll());
        return "create";
    }

    @PostMapping("/save")
    public String saveQuestion(@Valid @ModelAttribute("questionContent") QuestionContent questionContent,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes,
                               Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("questionType", questionTypeService.findAll());
            model.addAttribute("questionContent", questionContent);
            return "create";
        }
        questionContentService.save(questionContent);
        redirectAttributes.addFlashAttribute("success", "Them moi thanh công !!");
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String viewEdit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("questionContent", questionContentService.findById(id));
        model.addAttribute("questionType", questionTypeService.findAll());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("questionContent") QuestionContent questionContent, RedirectAttributes redirectAttributes) {


        redirectAttributes.addFlashAttribute("success", "Delete thanh cong!");
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("questionContent", questionContentService.findById(id));
        model.addAttribute("questionType", questionTypeService.findAll());
        return "list";
    }


    @PostMapping("/delete")
    public String delete(@ModelAttribute("questionContent") QuestionContent questionContent, RedirectAttributes redirectAttributes) {
        questionContentService.delete(questionContent.getId());
        redirectAttributes.addFlashAttribute("success", "Xoá thành công");
        return "redirect:/list";
    }

    @GetMapping("/list/search")
    public String search(@RequestParam("nameSearch") String name,
                         @RequestParam(value = "page", defaultValue = "0") int page, Model model
    ) {
        Page<QuestionContent> questionContentPage = questionContentService.searchByName(name, PageRequest.of(page, 5));
        model.addAttribute("nameSearch", name);
        model.addAttribute("questionContentList", questionContentPage);
        if (questionContentPage.isEmpty()) {
            return "404";
        }
        return "list";
    }


    @ExceptionHandler(IllegalStateException.class)
    public ModelAndView showInputNotAcceptable() {
        return new ModelAndView("404");
    }


}
