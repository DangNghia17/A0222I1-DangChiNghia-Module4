package com.nghia.repository;

import com.nghia.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Integer> {
}
