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
public class triangle {
    Scanner sc = new Scanner(System.in);
    float a;
    float b; 
    float c;
    float p;
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
    public void typeOfTritangle(){
        
                             if ((a == b) && (b == c)) {
			System.out.println("Đây là tam giác đều !");
		} else if ( ((a == b) || (b == c) || (c == a)) && ( ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) ) ){
                                            System.out.println("Đây là tam giác vuông cân !");
                            } else if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Đây là tam giác cân !");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("Đây là tam giác vuông !");
		} else {
                                            System.out.println("Đây là tam giác thường !");
                            }
    }
    public float SquareOfTri(){
        float S;
        S =(float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
    public float perimeterOfTri(){
        this.p = (a+b+c)/2;
        return p*2;
    }
}
