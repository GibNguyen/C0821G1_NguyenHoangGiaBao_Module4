package com.codegym.ung_dung_blog.service;

import com.codegym.ung_dung_blog.model.Blog;
import com.codegym.ung_dung_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService{
    @Autowired
    IBlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void saveBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(int id) {
        Blog blog=blogRepository.getById(id);
        blogRepository.delete(blog);
    }

    @Override
    public Blog findById(int id) {
        Blog blog=blogRepository.getById(id);
        return blog;
    }
}
