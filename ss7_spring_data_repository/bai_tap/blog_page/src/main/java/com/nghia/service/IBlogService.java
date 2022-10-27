package com.nghia.service;

import com.nghia.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    void save(Blog blog);

    void delete(Integer id);

    Blog findById(Integer id);

    Page<Blog> seachByName(String name , Pageable pageable);
}
