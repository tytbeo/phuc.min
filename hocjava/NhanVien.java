/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocjava;
import java.util.Scanner; 
/**
 *
 * @author Phuc
 */
public class NhanVien {
    String name;
    int age;
    String address;
    double salary;
    int workHours;
    Scanner sc = new Scanner(System.in);
    public void inputInfo(){
        System.out.println("enter employee's name : ");
        name = sc.next();
        
        sc.nextLine();
        System.out.println("enter employee's age : ");
        age = sc.nextInt();
        
        sc.nextLine();
        System.out.println("enter employee's address : ");
        address = sc.next();
        
        sc.nextLine();
        System.out.println("enter employee's salary : ");
        salary = sc.nextDouble();
        
        sc.nextLine();
        System.out.println("enter employee's work hours : ");
        workHours = sc.nextInt();
    }
    public void printInfo() {
        System.out.println("employee's name : " + name);
        System.out.println("employee's age : " + age);
        System.out.println("employee's address : " + address);
        System.out.println("employee's salary : " + salary);
        System.out.println("employee's work hours : " + workHours);
    }
    public double tinhThuong() {
        if (salary >= 200){
            return salary*0.2;
        } 
        else if (salary >=100 ){
            return salary*0.1;
        }
        else {
            return 0;
        }
        
    }
}
