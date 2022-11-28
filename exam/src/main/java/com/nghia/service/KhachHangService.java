package com.nghia.service;

import com.nghia.model.KhachHang;
import com.nghia.repository.IGiaoDichRepository;
import com.nghia.repository.IKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService implements IKhachHangService {
    @Autowired
    private IKhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public void create(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public void delete(Integer id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public KhachHang findById(Integer id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    @Override
    public List<KhachHang> searchByName(String name) {
        return khachHangRepository.findAllByTenKhachHangContaining(name);
    }
}
