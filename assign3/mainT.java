/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

/**
 *
 * @author Phuc
 */
public class mainT {
    public static void main(String[] args) {
        triangle tamgiac1 = new triangle();
        tamgiac1.inputInfor();
        tamgiac1.typeOfTritangle();
        System.out.println("chu vi của tam giác là  : " +  tamgiac1.perimeterOfTri());
        System.out.println("diện tích của tam giác là  : " + tamgiac1.SquareOfTri());
       
        rectangle hcn1 = new rectangle();
        hcn1.inputInfor();
        System.out.println("diện tích của hình chữ nhật là  : " +  hcn1.DienTich() +" ; chu vi của hình chữ nhật là : " + hcn1.ChuVi()) ;
        
    }
    
    
}
