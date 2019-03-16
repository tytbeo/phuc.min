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
public class mainTAM {
    public static void main(String[] args) {
        tamGiacVuong tri3 = new  tamGiacVuong();
        tri3.inputInfor();
        tri3.Check();
        tri3.printSquare();
        tri3.printPeri();
        tamGiacDeu tri5 = new  tamGiacDeu();
        tri5.inputInfor();
        tri5.Check();
        tri5.CheckDeu();
        tri5.printSquare();
        tri5.printPeri();
    }
}
