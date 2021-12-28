package com.example.demo.controller;

import com.example.demo.dto.RegisterFormDTO;
import com.example.demo.model.RegisterForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
@Controller
public class RegisterFormController {

    @GetMapping(value = "")
    public String getPageView( Model model){
        model.addAttribute("form",new RegisterForm());
        return "view";
    }

    @PostMapping(value = "create")
    public String createForm(@Valid @ModelAttribute(name="form")RegisterFormDTO registerFormDTO,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "view";
        }
        return "result";
    }
}
