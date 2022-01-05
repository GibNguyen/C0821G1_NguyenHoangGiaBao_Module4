package com.example.quan_ly_khach_hang.controller;

import com.example.quan_ly_khach_hang.model.KhachHang;
import com.example.quan_ly_khach_hang.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KhachHangController {
    @Autowired
    IKhachHangService khachHangService;

    @GetMapping(value = "/view")
    public String getPageView(Model model) {
        model.addAttribute("khachhang",new KhachHang());
        model.addAttribute("list", khachHangService.showAll());
        return "view";
    }

    @GetMapping(value = "create")
    public String getPageCreate(Model model) {
        model.addAttribute("khachhang",new KhachHang());
        return "create";
    }
    @PostMapping(value = "create")
    public String createKhachHang(@ModelAttribute(name = "khachhang")KhachHang khachHang,Model model){
        khachHangService.save(khachHang);
        model.addAttribute("list",khachHangService.showAll());
        return "view";
    }
    @PostMapping(value = "search")
    public String getPageSearch(@RequestParam(name="id") int id,Model model){
        List<KhachHang> khachHangList=new ArrayList<>();
        KhachHang khachHang=khachHangService.findById(id);
        khachHangList.add(khachHang);
        model.addAttribute("list",khachHangList);
        return "view";
    }

    @GetMapping(value ="delete")
    public String delete(@RequestParam(name = "idDelete")int idDelete,Model model){
        KhachHang khachHang=khachHangService.findById(idDelete);
        khachHangService.deleteKhachHang(khachHang);
        model.addAttribute("list",khachHangService.showAll());
        return "view";
    }

    @GetMapping(value = "edit")
    public String getPageEdit(@RequestParam(name = "idEdit")int idEdit,Model model){
        model.addAttribute("khachhang",khachHangService.findById(idEdit));
        return "edit";
    }
    @PostMapping(value = "edit")
        public String editKhachHang(@ModelAttribute(name = "khachhang")KhachHang khachHang,Model model){
            khachHangService.save(khachHang);
            model.addAttribute("list",khachHangService.showAll());
            return "view";
    }
}
