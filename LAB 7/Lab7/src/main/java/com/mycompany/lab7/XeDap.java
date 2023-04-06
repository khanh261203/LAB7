/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author ADMIN
 */
public class XeDap extends PhuongTienDiChuyen {
    private double vanToc;

    public XeDap(double vanToc, String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
        this.vanToc = vanToc;
    }

    @Override
    public double layVanToc() {
        return vanToc;
    }
}

