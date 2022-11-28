package com.nghia.controller;

import com.nghia.model.GiaoDich;
import com.nghia.model.KhachHang;
import com.nghia.service.IGiaoDichService;
import com.nghia.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SolController {
    @Autowired
    private IGiaoDichService giaoDichService;

    @Autowired
    private IKhachHangService khachHangService;

    @ModelAttribute("giaoDich")
    public GiaoDich initGiaoDich() {
        return new GiaoDich();
    }

    @ModelAttribute("khachHang")
    public KhachHang initKhachHang() {
        return new KhachHang();
    }

    @GetMapping("/list/search")
    public String search(@RequestParam("nameSearch") String name, Model model) {
        List<KhachHang> khachHang = khachHangService.searchByName(name);
        model.addAttribute("nameSearch", name);
        model.addAttribute("giaoDichList", khachHang);
        model.addAttribute("khachHangList", khachHang);
        return "list";
    }

    @GetMapping("list")
    public String showList(Model model) {
        model.addAttribute("giaoDichList", giaoDichService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("giaoDich",new GiaoDich());
        model.addAttribute("khachHang", khachHangService.findAll());
        return "create";
    }
    @PostMapping("/save")
    public String saveGD(@Valid @ModelAttribute("giaoDich") GiaoDich giaoDich,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes,
                               Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("khachHang", khachHangService.findAll());
            model.addAttribute("giaoDich", giaoDich);
            return "create";
        }
        giaoDichService.create(giaoDich);
        redirectAttributes.addFlashAttribute("success", "Them moi thanh công !!");
        return "redirect:/list";
    }
    @GetMapping("/delete/{id}")
    public String deleteForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("giaoDich", giaoDichService.findById(id));
        model.addAttribute("khachHang", khachHangService.findAll());
        return "list";
    }


    @PostMapping("/delete")
    public String delete(@ModelAttribute("giaoDich") GiaoDich giaoDich, RedirectAttributes redirectAttributes) {
        giaoDichService.delete(giaoDich.getMaGiaoDich());
        redirectAttributes.addFlashAttribute("success", "Xoá thành công");
        return "redirect:/list";
    }



}
