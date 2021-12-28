package com.example.thong_tin_bai_hat.controller;

import com.example.thong_tin_bai_hat.dto.BaiHatDTO;
import com.example.thong_tin_bai_hat.model.BaiHat;
import com.example.thong_tin_bai_hat.service.IBaiHatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class BaiHatController {
    @Autowired
    IBaiHatService baiHatService;

    @GetMapping("")
    public String getPageView(Model model) {
        model.addAttribute("listbaihat", baiHatService.showList());
        return "view";
    }

    @GetMapping(value = "/create")
    public String getPageCreate(Model model) {
    model.addAttribute("baihat",new BaiHatDTO());
    return "create";
    }

    @PostMapping(value = "/create")
    public String createBaiHat(@Valid @ModelAttribute(name = "baihat") BaiHatDTO baiHatDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "create";
        }
        baiHatService.createBaiHat(baiHatDTO);
        model.addAttribute("listbaihat", baiHatService.showList());
        return "view";
    }

    @GetMapping(value = "/edit")
    public String getPageEdit(@RequestParam(name="idEdit")int idEdit,Model model){
        model.addAttribute("baihat",baiHatService.findBaiHatById(idEdit));
        return "edit";
    }

    @PostMapping(value = "/edit")
    public String editBaiHat(@Valid @ModelAttribute(name = "baihat") BaiHatDTO baiHatDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "edit";
        }
        baiHatService.createBaiHat(baiHatDTO);
        model.addAttribute("listbaihat", baiHatService.showList());
        return "view";
    }
}
