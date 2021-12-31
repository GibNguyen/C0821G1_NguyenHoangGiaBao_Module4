package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;


@Controller
@SessionAttributes("productBag")
public class ProductController {

    @ModelAttribute("productBag")
    public List<Product> createProductBag(){
        return new ArrayList<>();
    }

    @Autowired
    @Qualifier("productService")
    IProductService productService;

    @GetMapping("")
    public String viewPage(Model model, @RequestParam(value = "page", defaultValue = "0")int page){
        Sort sort = Sort.by("id").descending();
        Page<Product> productPage = productService.findAll(PageRequest.of(page,3,sort));
        model.addAttribute("productPage", productPage);
        return "/view";
    }

    @PostMapping("detail/add")
    public String addToProductBag(@RequestParam("id")Integer id, @ModelAttribute("productBag")List<Product> products, RedirectAttributes redirectAttributes){
        Product product = productService.findById(id);
        products.add(product);
        for(Product product1:products){
            System.out.println(product1.getName());
        }
        redirectAttributes.addFlashAttribute("msg","Add Product Bag successful!");
        return "redirect:/";
    }
    @GetMapping ("detail")
    public String detailProduct(@RequestParam(name = "id")Integer id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "/detail";
    }
    @GetMapping("list")
    public String productListPage (@ModelAttribute("productBag")List<Product> products, Model model){
        model.addAttribute("products", products);
        return "/product-list";
    }

}

