/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASMjava;

/**
 *
 * @author Phuc
 */
public class Rectangle extends GeometricObject{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        System.out.println("bạn vừa tạo ra 1 đối tượng hình chữ nhật");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return this.height*this.width;
    };
    public double getPerimeter(){
        return (this.height+this.width)*2;
    };
}
