package com.nghia.model;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Entity
public class GiaoDich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maGiaoDich;

//    @NotEmpty(message = "Khong duoc de trong")
    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
    private KhachHang maKhachHang;


    @Column(columnDefinition = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent(message = "Ngay thang nam phai lon hon hien tai !")
    @NotEmpty
    private LocalDate ngayGiaoDich ;

    @NotEmpty(message = "Khong duoc de trong")
    private String loaiDichVu;

    @Range(min = 500000 , message = "lon hon 500.000")

    private Long donGia;

    @Range(min = 500000 , message = "lon hon 20")
    private Long dienTich;

    public GiaoDich() {
    }

    public GiaoDich(Integer maGiaoDich, @NotEmpty(message = "Khong duoc de trong") KhachHang maKhachHang, @NotEmpty(message = "Khong duoc de trong") @PastOrPresent(message = "Ngay thang nam phai lon hon hien tai !") LocalDate ngayGiaoDich, @NotEmpty(message = "Khong duoc de trong") String loaiDichVu, @NotEmpty(message = "Khong duoc de trong") @Range(min = 500000, message = "lon hon 500.000") Long donGia, @NotEmpty(message = "Khong duoc de trong") @Range(min = 500000, message = "lon hon 20") Long dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.maKhachHang = maKhachHang;
        this.ngayGiaoDich = ngayGiaoDich;
        this.loaiDichVu = loaiDichVu;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public Integer getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(Integer maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public KhachHang getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(KhachHang maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public Long getDonGia() {
        return donGia;
    }

    public void setDonGia(Long donGia) {
        this.donGia = donGia;
    }

    public Long getDienTich() {
        return dienTich;
    }

    public void setDienTich(Long dienTich) {
        this.dienTich = dienTich;
    }
}
