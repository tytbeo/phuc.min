/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;
import java.util.Scanner; 

/**
 *
 * @author Phuc
 */
public class rectangle {
     Scanner sc = new Scanner(System.in);
    float a;
    float b;
    public void inputInfor(){
         System.out.println("enter a : ");
        this.a = sc.nextFloat();
        sc.nextLine();
         
        System.out.println("enter b : ");
        this.b = sc.nextFloat();
    }
    public float DienTich(){
        float P = (a+b)*2;
        return P;
    }
    public float ChuVi(){
        return a*b;
    }
}
