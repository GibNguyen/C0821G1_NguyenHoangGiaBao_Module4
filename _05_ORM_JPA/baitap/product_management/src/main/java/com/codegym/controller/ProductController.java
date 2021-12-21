package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String deleteProduct(@RequestParam(name="idDelete") int idDelete, Model model){
        iProductService.deleteProductById(idDelete);
        model.addAttribute("productListController",iProductService.showAll());
        return "view";
    }
    @GetMapping("edit")
    public String getPageEdit(@RequestParam(name="idEdit")int idEdit, Model model){
        model.addAttribute("productEdit",iProductService.findByID(idEdit));
        return "edit_product";
    }
    @PostMapping("edit")
    public String editProduct(@RequestParam(name="id")int idEdit,@RequestParam(name="name")String nameEdit,@RequestParam(name="price")double priceEdit,@RequestParam(name="producer")String producerEdit,Model model){
        iProductService.editProductById(idEdit,nameEdit,priceEdit,producerEdit);
        model.addAttribute("productListController",iProductService.showAll());
        return "view";
    }
}
