package com.company;

import java.util.Scanner;

public class TaiKhoan {
    private int soTaiKhoan;
    private Khachhang khachhang;
    private int soTien;

    public TaiKhoan(int soTaiKhoan, Khachhang khachhang, int soTien){
        this.soTaiKhoan = soTaiKhoan;
        this.khachhang = khachhang;
        this.soTien = soTien;
    }

    public void setSoTaiKhoan(int soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public int getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

    public Khachhang getKhachhang() {
        return khachhang;
    }

    public String hoTen(){
        return khachhang.getTenKhachHang();
    }

    public void naptien(){
        System.out.println("Nhập số tiền bạn muốn nạp : ");
        Scanner sc =  new Scanner(System.in);
        int tien = sc.nextInt();
        this.soTien += tien;
        System.out.println("Số dư trong tài khoản của bạn là : " + this.soTien);
    }

    public void ruttien(){
        int tien;
        do {
            System.out.println("Nhập số tiền bạn muốn rút : ");
            Scanner sc =  new Scanner(System.in);
            tien = sc.nextInt();
            if (tien > this.soTien) System.out.println("Bạn không đủ tiền trong tài khoản ! Vui lòng nạp thêm tiền");

        }while( tien > this.soTien);
        this.soTien -= tien;
        System.out.println("Rút tiền thành công. Số dư còn lại trong tài khoản của bạn là : " + this.soTien);
    }
}
