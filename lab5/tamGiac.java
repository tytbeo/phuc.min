/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.Scanner; 

/**
 *
 * @author Phuc
 */
public class tamGiac {
    float a;
    float b; 
    float c;
    float p;
    float S;
    float P;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    Scanner sc = new Scanner(System.in);
    public void inputInfor(){
        System.out.println("enter a : ");
        this.a = sc.nextFloat();
        sc.nextLine();
         
        System.out.println("enter b : ");
        this.b = sc.nextFloat();
        sc.nextLine();
        
        System.out.println("enter c : ");
        this.c = sc.nextFloat();
        
        if ((this.a + this.b > this.c) || (this.a + this.c > this.b) || (this.b + this.c > this.a)) {
	System.out.println("Đây là tam giác !");
        }
        else {
            System.out.println("Đây không phải tam giác ! vui lòng nhập lại");
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }
    public float SquareOfTri(){
        this.p = (a+b+c)/2;
        float Square =(float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        this.S = Square;
        return Square;
    }
    public float perimeterOfTri(){
        this.P = (a+b+c);
        return P;
    }
    void printSquare(){
        this.p = (a+b+c)/2;
        float Square =(float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        this.S = Square;
        System.out.println("diện tích tam giác = " + this.S);
    }
    void printPeri(){
        this.P = (a+b+c);
        System.out.println("chu vi tam giác = " + this.P);
    }
}
