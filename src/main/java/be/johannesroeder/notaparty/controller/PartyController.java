package be.johannesroeder.notaparty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PartyController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("home", "Dit is geen party");
        return "home";
    }
}
