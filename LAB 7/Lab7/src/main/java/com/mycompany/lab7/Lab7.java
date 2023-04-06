/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author ADMIN
 */
public class Lab7 {

    public static void main(String[] args) {
               // tạo đối tượng hãng sản xuất
        HangSanXuat honda = new HangSanXuat("Honda", "Nhật Bản");

        // tạo đối tượng XeOTo và truyền tham số
        XeOTo xeOTo = new XeOTo("Xăng", 80.0, "Ô tô", honda);

        // gọi các phương thức của đối tượng XeOTo
        System.out.println("Loại nhiên liệu: " + xeOTo.getLoaiNhienLieu());
        System.out.println("Vận tốc: " + xeOTo.layVanToc());
        System.out.println("Hãng sản xuất: " + xeOTo.layTenHangSanXuat());

        // tạo đối tượng XeDap và truyền tham số
        XeDap xeDap = new XeDap(20.0, "Xe đạp", honda);

        // gọi các phương thức của đối tượng XeDap
        System.out.println("Vận tốc: " + xeDap.layVanToc());
        System.out.println("Hãng sản xuất: " + xeDap.layTenHangSanXuat());
        
      
  // Test MoveablePoint
        MoveablePoint p1 = new MoveablePoint(0, 0, 1, 1);
        System.out.println("p1: " + p1);
        p1.moveUp();
        System.out.println("p1: " + p1);
        p1.moveLeft();
        System.out.println("p1: " + p1);

        // Test MoveableCircle
        MoveableCircle c1 = new MoveableCircle(0, 0, 1, 1, 5);
        System.out.println("c1: " + c1);
        c1.moveRight();
        System.out.println("c1: " + c1);
        c1.moveDown();
        System.out.println("c1: " + c1);
    }
}
