/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesson2_lab;

import java.util.Scanner;
/**
 *
 * @author Phuc
 */
public class Student {
    String StudentCode;
    int age;
    double AvgGrade;
    String ClassName;

    public String getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(String StudentCode) {
        this.StudentCode = StudentCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgGrade() {
        return AvgGrade;
    }

    public void setAvgGrade(double AvgGrade) {
        this.AvgGrade = AvgGrade;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }
    Student(){
        System.out.println("vua tao ra 1 doi tuong sinh vien");
    }

    Student(int x){
        System.out.println("vua tao ra 1 doi tuong sinh vien "+x);
    }

    Student(String Code){
        System.out.println("vua tao ra 1 doi tuong sinh vien co ma so la "+Code);
    }

    
    void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        StudentCode = sc.nextLine();
        
        System.out.println("Nhap tuoi:");
        age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Nhap diem trung binh:");
        AvgGrade = sc.nextDouble();
        sc.nextLine();
                
        System.out.println("Nhap lop:");
        ClassName = sc.nextLine();
    }

   void printInfo(){
        System.out.println("ma hoc sinh: "+StudentCode+ " tuoi: "+age +" lop" + ClassName);
        System.out.println("diem trung binh : "+AvgGrade);
    }
   void xetHocBong(){
        if (AvgGrade > 8.0 ){
            System.out.println("dat duoc hoc bong");
        }
        else {
            System.out.println("khong dat duoc hoc bong");
        }
    }
   
    public static void main(String[] args) {
        Student hocsinh1 = new Student("001");
        hocsinh1.inputInfo();
        hocsinh1.printInfo();
        hocsinh1.xetHocBong();
        hocsinh1.setAvgGrade(9.1);
    }
}
