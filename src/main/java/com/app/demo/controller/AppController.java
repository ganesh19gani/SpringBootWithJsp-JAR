package com.app.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

    @GetMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("greetings", "Hi FirstPage");
        return "firstPage";
    }
    @GetMapping("/secondPage")
    public String helloWorldFromSecondPage(Model model) {
        model.addAttribute("greetings", "Hi SecondPage");
        return "secondPage";
    }
}
