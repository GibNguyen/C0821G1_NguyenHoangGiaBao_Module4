package com.codegym.controller;

import com.codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/config")
public class EmailController {

    @GetMapping("email")
    public String configEmail(Model model){
        String[] language = {"English","Vietnamese","Japanese","Chinese"};
        Integer[] pageSize = {5,10,15,25,50,100};
        model.addAttribute("language",language);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("configEmail",new Email());
        return "setting_email";
    }

    @PostMapping("info_config")
    public String updateEmail(@ModelAttribute("configEmail") Email Email, Model model){
        model.addAttribute("configEmail",Email);
        return "index";
    }

}
