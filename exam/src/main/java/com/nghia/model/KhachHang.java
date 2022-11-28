package com.nghia.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maKhachHang;

//    @NotEmpty(message = "Khong duoc de trong")
    private String tenKhachHang = "Hello1";

    @NotEmpty(message = "Khong duoc de trong")
    private String soDienThoai;

    @NotEmpty(message = "Khong duoc de trong")
    private String email;

    @OneToMany(mappedBy = "maKhachHang")
    private Set<GiaoDich> giaoDich;

    public KhachHang() {
    }

    public KhachHang(Integer maKhachHang, @NotEmpty(message = "Khong duoc de trong") String tenKhachHang, @NotEmpty(message = "Khong duoc de trong") String soDienThoai, @NotEmpty(message = "Khong duoc de trong") String email, Set<GiaoDich> giaoDich) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.giaoDich = giaoDich;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<GiaoDich> getGiaoDich() {
        return giaoDich;
    }

    public void setGiaoDich(Set<GiaoDich> giaoDich) {
        this.giaoDich = giaoDich;
    }
}
