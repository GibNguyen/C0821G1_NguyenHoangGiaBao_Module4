package com.codegym.controller;

import com.codegym.model.ToKhaiYTe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ToKhaiYTeController {

    @GetMapping("")
    public String toKhaiYTe(Model model){
        String[] gioiTinh = {"Nam","Nu"};
        String[] thongTinDiLai = {"May Bay","Tau Thuyen","O To","Khac"};
        String[] trieuChung = {"Sốt","Ho","Khó thở","Đau họng","Nôn/Buồn Nôn","Tiêu chảy","Xuất huyết ngoài da","Nổi ban ngoài da","Không"};
        String[] lichSuPhoiNhiem = {"Đến trang trại chăn nuôi/chợ buôn bán động vật sống/cơ sở giết mổ động vật/tiếp xúc động vậy",
                "Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp do nCoV","Không"};
        model.addAttribute("gioiTinh",gioiTinh);
        model.addAttribute("thongTinDiLai",thongTinDiLai);
        model.addAttribute("trieuChung",trieuChung);
        model.addAttribute("lichSuPhoiNhiem",lichSuPhoiNhiem);


        model.addAttribute("toKhaiYTe",new ToKhaiYTe());
        return "tokhaiyte";
    }

    @PostMapping("capnhattokhaiyte")
    public String capNhatToKhaiYTe(@ModelAttribute("toKhaiYTe") ToKhaiYTe toKhaiYTe, Model model){
        model.addAttribute("toKhaiYTe",toKhaiYTe);
        return "index";
    }
}
