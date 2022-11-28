package com.nghia.service;

import com.nghia.model.GiaoDich;
import com.nghia.model.KhachHang;
import com.nghia.repository.IGiaoDichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiaoDichService implements IGiaoDichService {

    @Autowired
    private IGiaoDichRepository giaoDichRepository;

    @Override
    public List<GiaoDich> findAll() {
        return giaoDichRepository.findAll();
    }

    @Override
    public void create(GiaoDich giaoDich) {
        giaoDichRepository.save(giaoDich);
    }

    @Override
    public void delete(Integer id) {
        giaoDichRepository.deleteById(id);
    }

    @Override
    public GiaoDich findById(Integer id) {
        return giaoDichRepository.findById(id).orElse(null);
    }

//    @Override
//    public List<KhachHang> searchByName(String name) {
//        return giaoDichRepository.findAllByLoaiDichVuContaining(name);
//    }
}
