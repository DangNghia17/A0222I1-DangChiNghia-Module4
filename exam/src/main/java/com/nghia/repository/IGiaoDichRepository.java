package com.nghia.repository;

import com.nghia.model.GiaoDich;
import com.nghia.model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface IGiaoDichRepository extends JpaRepository<GiaoDich,Integer> {
    List<KhachHang> findAllByLoaiDichVuContaining(@Param("name") String name);

}
