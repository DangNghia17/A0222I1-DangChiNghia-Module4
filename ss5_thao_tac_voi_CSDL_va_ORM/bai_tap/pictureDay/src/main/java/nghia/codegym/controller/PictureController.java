package nghia.codegym.controller;

import nghia.codegym.model.Feedback;
import nghia.codegym.repository.FeedbackRepository;
import nghia.codegym.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PictureController {
    @GetMapping("/")
    public String goIndex(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "home";
    }
//Not create database - Reason : config hibernate
    // when click button don't forward request


}
