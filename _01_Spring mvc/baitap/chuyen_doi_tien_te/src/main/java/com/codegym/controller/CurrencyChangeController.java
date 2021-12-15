package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyChangeController {
    @GetMapping("")
    public String show() {
        return "index";
    }
    @PostMapping("")
    public String change(@RequestParam(name = "usd") int usd,Model model){
        model.addAttribute("result",usd*22000);
        return "index";
    }
}
