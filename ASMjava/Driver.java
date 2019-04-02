/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASMjava;

import java.util.ArrayList;

/**
 *
 * @author Phuc
 */
public class Driver {
    public static double sumArea(ArrayList<GeometricObject> arr) {
        double total = 0;
        for(GeometricObject array : arr){
            total +=array.getArea();
        }
        return total;
    }
    
    public static void main(String[] args) {
        ArrayList<GeometricObject> CircleArr = new ArrayList<>();
        CircleArr.add(new Circle(12));
        CircleArr.add(new Circle(3));
        CircleArr.add(new Circle(4));
        
        ArrayList<GeometricObject> recArr = new ArrayList<>();
        recArr.add(new Rectangle(10,20));
       recArr.add(new Rectangle(4,9));
       recArr.add(new Rectangle(11,13));
       
       double sumC = Driver.sumArea(CircleArr);
       double sumR = Driver.sumArea(recArr);
       double total = sumC + sumR;
        System.out.println("sum of 2 array: " + total);
    }
}
