/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author ADMIN
 */
public class MoveableCircle implements Moveable {
    private MoveablePoint center;
    private int radius;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MoveablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MoveablePoint getCenter() {
        return center;
    }

    public void setCenter(MoveablePoint center) {
        this.center = center;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MoveableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

