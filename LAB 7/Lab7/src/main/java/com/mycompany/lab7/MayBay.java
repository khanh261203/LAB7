/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author ADMIN
 */
public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay(String loaiNhienLieu, String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println("Cất cánh máy bay");
    }

    public void haCanh() {
        System.out.println("Hạ cánh máy bay");
    }

    @Override
    public double layVanToc() {
        return 500; //giả sử máy bay đang di chuyển với tốc độ 500km/h
    }
}
