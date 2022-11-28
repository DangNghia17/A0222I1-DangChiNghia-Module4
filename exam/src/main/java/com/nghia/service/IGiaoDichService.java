package com.nghia.service;

import com.nghia.model.GiaoDich;
import com.nghia.model.KhachHang;

import java.util.List;

public interface IGiaoDichService {
    List<GiaoDich> findAll();

    void create(GiaoDich giaoDich);

    void delete(Integer id);

    GiaoDich findById(Integer id);

//    List<KhachHang> searchByName(String name);

}
