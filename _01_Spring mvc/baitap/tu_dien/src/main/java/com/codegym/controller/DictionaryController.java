package com.codegym.controller;

import com.codegym.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService iDictionaryService;

    @GetMapping("")
    public String show() {
        return "index";
    }

    @PostMapping("")
    public String find(@RequestParam(name = "word") String wordFind, Model model) {
        int index = -1;
        for (int i = 0; i < iDictionaryService.getWordEnglish().length; i++) {
            if (wordFind.equals(iDictionaryService.getWordEnglish()[i])) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            model.addAttribute("result", "Không tìm thấy");
        } else {
            model.addAttribute("result", iDictionaryService.getWordVietnam()[index]);
        }
        return "index";
    }
}
