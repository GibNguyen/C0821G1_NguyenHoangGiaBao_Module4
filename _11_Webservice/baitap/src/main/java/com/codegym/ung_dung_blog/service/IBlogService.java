package com.codegym.ung_dung_blog.service;

import com.codegym.ung_dung_blog.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBlogService {
    List<Blog> findAll();

    void saveBlog(Blog blog);

    void deleteBlog(int id);

    Blog findById(int id);
}
