package com.nghia.controller;

import com.nghia.entity.HealthDeclare;
import com.nghia.service.HealthFormServiceImpl;
import com.nghia.service.IHealthFormService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HealthDeclareController {
    IHealthFormService healthFormService = new HealthFormServiceImpl();

    @ModelAttribute("healthDeclare")
    public HealthDeclare initHealthDeclare() {
        return new HealthDeclare();
    }
    @GetMapping("/display")
    public ModelAndView display() {
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.addObject("gender", healthFormService.genderList());
        modelAndView.addObject("nationality", healthFormService.nationalityList());
        modelAndView.addObject("travelInfo", healthFormService.travelInfoList());
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("healthDeclare") HealthDeclare healthDeclare) {
        ModelAndView modelAndView = null;
        Map<String, String> error = healthFormService.checkData(healthDeclare);
        if (!error.isEmpty()) {
            modelAndView = new ModelAndView("form");
            modelAndView.addObject("healthDeclare", healthDeclare);
            modelAndView.addObject("error", error);
            modelAndView.addObject("gender", healthFormService.genderList());
            modelAndView.addObject("nationality", healthFormService.nationalityList());
            modelAndView.addObject("travelInfo", healthFormService.travelInfoList());
        } else {
            modelAndView = new ModelAndView("detail");
            modelAndView.addObject("healthDeclare", healthDeclare);
        }
       return modelAndView;
    }
}
