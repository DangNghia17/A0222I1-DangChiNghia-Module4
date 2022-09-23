package nghia.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SwapController {
    @GetMapping("/swapmoney")
    public String showForm() {
        return "swap";
    }

    @PostMapping("/outmoney")
    public String outMoney(@RequestParam("USD") String USD, @RequestParam("currencyRate") String currencyRate, Model model) {
        model.addAttribute("USD", USD);
        model.addAttribute("currencyRate", currencyRate);
        double result = Integer.parseInt(USD) * Integer.parseInt(currencyRate);
        model.addAttribute("result", result);
        return "swap";
    }
}
