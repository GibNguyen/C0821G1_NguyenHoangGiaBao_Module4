package com.codegym.ung_dung_blog.controller;

import com.codegym.ung_dung_blog.dto.BlogDto;
import com.codegym.ung_dung_blog.model.Blog;
import com.codegym.ung_dung_blog.service.IBlogService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/blogRest")
public class BlogRestController {
    @Autowired
    IBlogService blogService;

    @GetMapping(value = "/list")
    public ResponseEntity<List<Blog>> getListBlog(){
        List<Blog> blogList=blogService.findAll();
        if(blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createBlog(@RequestBody @Valid BlogDto blogDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Blog blog = new Blog();
        BeanUtils.copyProperties(blogDto,blog);
        blogService.saveBlog(blog);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
