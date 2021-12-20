package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("")
    public String getPageView(Model model){
        model.addAttribute("productListController",iProductService.showAll());
        return "view";
    }

    @GetMapping("create")
    public String getPageCreate(Model model){
        model.addAttribute("product",new Product());
        return "create_product";
    }
    @PostMapping("create")
    public String createProduct(@ModelAttribute(name = "product")Product product,Model model){
        iProductService.saveProduct(product);
        model.addAttribute("productListController",iProductService.showAll());
        return "view";
    }
    @GetMapping("delete")
    public String deleteProduct(@ModelAttribute(name = "product")Product product,Model model){
        iProductService.
        model.addAttribute("productListController",iProductService.showAll());
        return "view";
    }
}
