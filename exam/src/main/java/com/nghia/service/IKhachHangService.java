package com.nghia.service;

import com.nghia.model.GiaoDich;
import com.nghia.model.KhachHang;

import java.util.List;

public interface IKhachHangService {
    List<KhachHang> findAll();

    void create(KhachHang khachHang);

    void delete(Integer id);

    KhachHang findById(Integer id);

    List<KhachHang> searchByName(String name);
}
