package nghia.codegym.controller;

import nghia.codegym.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class DictionaryController {
    @Autowired
    private LanguageService languageService;

    @GetMapping("/dictionary")
    public String home() {
        return "home";
    }

    @PostMapping("/dictionary")
    public String translated(@RequestParam("english") String english, Model model) {
        model.addAttribute("english", english);
        String result = languageService.translate(english);
        model.addAttribute("result", result);
        return "home";
    }
}
