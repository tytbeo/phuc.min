/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocjava;

/**
 *
 * @author Phuc
 */
public class Hocjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien employee1 = new NhanVien();
        employee1.inputInfo() ;
        employee1.printInfo(); 
         System.out.println("bonus salary is : "+  employee1.tinhThuong());
       
        
    }
    
}
