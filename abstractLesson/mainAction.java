/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractLesson;

/**
 *
 * @author Phuc
 */
public class mainAction {
    public static void main(String[] args) {
        PhoneBook list1 = new PhoneBook();
        list1.insertPhone("nguyễn văn A","0913666111" );
        list1.insertPhone("nguyễn văn B","0913666333" );
        list1.insertPhone("nguyễn văn A","0913666300" );
        list1.printList();
        
        list1.removePhone("nguyễn văn B");
        list1.printList();
        
        list1.updatePhone("nguyễn văn C"  , "0913666123");
        list1.updatePhone("nguyễn văn D"  , "0913667773");
        list1.updatePhone("cao văn E"  , "0913699999");
        list1.insertPhone("anh văn thắng","0913336300" );
        list1.insertPhone("ban văn T","0913336440" );
        list1.printList();
        
        
        list1.searchPhone("nguyễn văn A");
        list1.searchPhone("nguyễn văn B");
        
        
        list1.sort();
        list1.printList();
    }
}
