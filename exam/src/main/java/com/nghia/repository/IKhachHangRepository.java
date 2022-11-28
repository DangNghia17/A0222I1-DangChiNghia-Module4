package com.nghia.repository;

import com.nghia.model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IKhachHangRepository extends JpaRepository<KhachHang, Integer> {
    List<KhachHang> findAllByTenKhachHangContaining(@Param("name") String name);
}
