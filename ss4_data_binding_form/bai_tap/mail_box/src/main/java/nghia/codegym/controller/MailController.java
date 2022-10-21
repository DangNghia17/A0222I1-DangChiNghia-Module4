package nghia.codegym.controller;

import nghia.codegym.entity.Email;
import nghia.codegym.service.IMailLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailController {
    @Autowired
    IMailLanguageService mailLanguageService;

    @ModelAttribute("createEmail")
    public Email createEmail() {
        return new Email();
    }

    @GetMapping("/home")
    public String display(@ModelAttribute("createEmail") Email email, Model model) {
        model.addAttribute("createEmail", new Email());
        model.addAttribute("language", mailLanguageService.listAllLaguage());
        return "home";
    }

    @PostMapping("/update")
    public String save(@ModelAttribute("createEmail") Email email, Model model) {
        model.addAttribute("language", mailLanguageService.listAllLaguage());
        model.addAttribute("email", email); //sang trang update thì gán vào đối tượng email
        return "update";
    }
}
