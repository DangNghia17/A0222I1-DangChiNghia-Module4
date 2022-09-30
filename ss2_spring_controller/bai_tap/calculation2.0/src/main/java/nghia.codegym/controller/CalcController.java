package nghia.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
    @GetMapping("/calc")
    public String home() {
        return "home";
    }

    @PostMapping("/calc")
    public String calc(@RequestParam("calculator") String calc,
                       @RequestParam("number1") double number1,
                       @RequestParam("number2") double number2,
                       Model model) {
        double result = 0; // default value if you dont input value
        switch (calc) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("calculator", calc);
        model.addAttribute("result", result);
        return "home";
    }
}
