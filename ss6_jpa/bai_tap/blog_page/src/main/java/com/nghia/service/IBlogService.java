package com.nghia.service;

import com.nghia.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void create(Blog blog);

    void update(Blog blog);

    void delete(Integer id);

    Blog findById(Integer id);

    List<Blog> searchByName(String name);
}
