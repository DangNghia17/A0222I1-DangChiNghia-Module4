package com.nghia.service;

import com.nghia.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(Integer id);

    void remove(Integer id);
}
