package com.codegym.ung_dung_blog.controller;

import com.codegym.ung_dung_blog.model.Blog;
import com.codegym.ung_dung_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping(value = "")
    public String viewBlog(Model model){
        model.addAttribute("blogs",blogService.findAll());
        return "view";
    }

    @GetMapping(value = "create")
    public String getPageCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping(value = "create")
    public String createBlog(@ModelAttribute(name = "blog") Blog blog, Model model){
            blogService.saveBlog(blog);
            model.addAttribute("blogs",blogService.findAll());
            return "view";
    }

    @GetMapping(value = "delete")
    public String deleteBlog(@RequestParam(value = "idDelete")int idDelete, Model model){
        blogService.deleteBlog(idDelete);
        model.addAttribute("blogs",blogService.findAll());
        return "view";
    }

    @GetMapping(value = "edit")
    public String getPageEdit(@RequestParam(name = "idEdit")int idEdit,Model model){
        model.addAttribute("blog",blogService.findById(idEdit));
        return "edit";
    }

    @PostMapping(value = "edit")
    public String editBlog(@ModelAttribute(name="blog")Blog blog,Model model){
        blogService.saveBlog(blog);
        model.addAttribute("blogs",blogService.findAll());
        return "view";
    }
}
