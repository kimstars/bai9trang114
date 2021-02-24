package com.company;

public class Main {

    public static void main(String[] args) {
        Khachhang khach = new Khachhang(001, "Chu Tuan Kiet", "VietNam");
        TaiKhoan tk = new TaiKhoan(123, khach, 100);

        tk.ruttien();
    }
}
