package com.nghia.repository;

import com.nghia.entity.Customer;

import java.util.List;

public interface IGeneralRepository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
