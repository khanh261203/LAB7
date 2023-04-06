/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author ADMIN
 */

    public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public abstract double layVanToc();

    public String layTenHangSanXuat() {
        return hangSanXuat.getTenHangSanXuat();
    }

    public void batDau() {
        System.out.println("Bắt đầu di chuyển " + loaiPhuongTien);
    }

    public void tangToc() {
        System.out.println("Tăng tốc " + loaiPhuongTien);
    }

    public void dungLai() {
        System.out.println("Dừng lại " + loaiPhuongTien);
    }
}
