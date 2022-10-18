package ru.kurochkina.neoflex.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kurochkina.neoflex.model.Calculator;

@Controller
public class VacationController {

    @GetMapping("/calculate")
    public String get(Model model){
        model.addAttribute("calculator", new Calculator());
        return "index";
    }

    @PostMapping("/calculate")
    public String form(@ModelAttribute Calculator calculator, BindingResult result,  Model model){
        model.addAttribute("calculator", calculator);
        return "vacationpay";
    }

}
