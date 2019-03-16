/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Phuc
 */
public class TamGiacCan extends tamGiac {
    void Check(){
         if (((this.a == this.b) || (this.b == this.c) || (this.c == this.a)) && ( ((this.a * this.a == this.b * this.b + this.c * c) || (this.b * this.b == this.a * this.a + this.c * this.c) || (this.c * this.c == this.b * this.b + this.a * this.a)))) {
	System.out.println("Đây là tam giác cân !");
         } 
         else {
             if( this.CheckDeu() == false){
                 System.out.println("Đây không phải tam giác cân ! tam giác cân là tam giác có 1 cặp cạnh chung đỉnh bằng nhau");
             }
         }
    }
    boolean CheckDeu(){
        if ((this.a == this.b) && (this.b == this.c)){
             System.out.println("Đây là tam giác đều !");
             return true;
         }
        else {
            return false;
        }
    }
}
