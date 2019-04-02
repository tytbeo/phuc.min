/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASMjava;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Phuc
 */
public class Circle extends  GeometricObject{
    double radius;
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        System.out.println("bạn vừa tạo ra 1 đối tượng hình tròn" );
    }
    public double getDiameter(){
        return this.radius*2;
    }
    @Override
    public double getArea(){
        return this.radius*this.radius*3.14;
    };
    public double getPerimeter(){
        return this.radius*2*3.14;
    };

}
