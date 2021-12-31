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
    public List<Product> createProductBag() {
        return new ArrayList<>();
    }

    @Autowired
    @Qualifier("productService")
    IProductService productService;

    @GetMapping("")
    public String viewPage(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
        Sort sort = Sort.by("id").descending();
        Page<Product> productPage = productService.findAll(PageRequest.of(page, 3, sort));
        model.addAttribute("productPage", productPage);
        return "/view";
    }

    @PostMapping("detail/add")
    public String addToProductBag(@RequestParam("id") Integer id, @ModelAttribute("productBag") List<Product> products, RedirectAttributes redirectAttributes, @RequestParam("quantity") int quantity) {
        Product product = productService.findById(id);
        product.setQuantity(quantity);
        products.add(product);
        redirectAttributes.addFlashAttribute("msg", "Add Product Bag successful!");
        return "redirect:/";
    }

    @GetMapping("detail")
    public String detailProduct(@RequestParam(name = "id") Integer id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "/detail";
    }

    @GetMapping("list")
    public String productListPage(@ModelAttribute("productBag") List<Product> products, Model model) {
        double sum=0;
        for(Product product:products){
            sum = sum+(product.getPrice()*product.getQuantity());
        }
        model.addAttribute("sum",sum);
        model.addAttribute("products", products);
        return "/product-list";
    }

    @GetMapping("delete")
    public String deleteProductList(@ModelAttribute("productBag") List<Product> products, Model model, @RequestParam("idDelete") int idDelete) {
        for(int i=0;i<products.size();i++){
            if(products.get(i).getId()==idDelete){
                products.remove(products.get(i));
            }
        }
        double sum=0;
        for(Product product:products){
            sum = sum+(product.getPrice()*product.getQuantity());
        }
        model.addAttribute("sum",sum);
        model.addAttribute("products", products);
        return "/product-list";
    }
}

