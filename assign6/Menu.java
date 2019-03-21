/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign6;

import java.util.Scanner;

/**
 *
 * @author Phuc
 */
public class Menu {
    
    public static void main(String[] args) {
        int choosen = 0;
        Scanner sc = new Scanner(System.in);
        GetMethod PP = new GetMethod();
        while (choosen != 4) {
            
            System.out.println("\n 1. Insert news\n" +
            "2. View list news\n" +
            "3. Average rate\n" +
            "4. Exit");
            System.out.println("nhập số từ 1-4: ");
            choosen = sc.nextInt();
            sc.nextLine();
            switch(choosen) {
                case 1 : 
                    PP.insertNews();
                    break;
                case 2 : 
                    PP.ShowList();
                    break;
                case 3 :
                    PP.AvG();
                    break;
                case 4 :
                    System.out.println("chương trình kết thúc");
                    break;
                default :
                    System.out.println("hãy chọn đúng phương thức (1-4) !");
            }
        }
        

    }
}
