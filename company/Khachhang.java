package com.company;

public class Khachhang {
    public int maKhachHang;
    public String tenKhachHang;
    public String diaChi;

    public Khachhang(int maKhachHang, String tenKhachHang, String diaChi){
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

}
