/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesson1;
import java.util.*;
/**
 *
 * @author Phuc
 */
public class Sesson1 {
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int max;
            System.out.println("enter max :");
            max = sc.nextInt();
            System.out.println(1);
            for(int i =2;i <=max;i++  ){
                int count=1;
                for(int j=2;j<=i;j++){
                    if(i%j==0){
                        count+=1;
                    }
                }
                if (count==2){
                    System.out.println(i +"    ");
                }
            }
            
            System.out.println("Fibonacci total");
            int a = 0;
            int b = 1;
            int c[] = new int[20];
            c[0] = 0;
            c[1] = 1;
            int total = 1;
            for(int x=2;x<20;x++){
                c[x] = c[x-2]+c[x-1];
                total += c[x];
            }
            System.out.println("Fibonacci total : " + total);
            
    }
    
}
