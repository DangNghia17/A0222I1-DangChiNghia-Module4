package com.nghia.music.controller;

import com.nghia.music.entity.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class SongController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("song", new Song());
        return "index";
    }

    @PostMapping("/")
    public ModelAndView getInfo(@Valid @ModelAttribute("song") Song song, BindingResult bindingResult) {
        new Song().validate(song, bindingResult);
        if (bindingResult.hasErrors()) {
            return new ModelAndView("index", "song", song);
        } else {
            return new ModelAndView("success");  //No directory database
        }
    }


}
