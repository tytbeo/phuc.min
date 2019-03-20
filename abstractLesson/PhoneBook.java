/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractLesson;

import com.sun.org.apache.regexp.internal.REUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Phuc
 */
public class PhoneBook extends Phone {

    public PhoneBook() {
        ArrayList<PhoneList> PhoneListt = new ArrayList<>()  ;
    }
    ArrayList<PhoneList> PhoneListt = new ArrayList<>();
    @Override
    void insertPhone(String name, String phone) {
        if(this.PhoneListt.size()>0){
            for(PhoneList P : this.PhoneListt){
               if( P.getName().equals(name) ){
                   if(P.getPhone().equals(phone)) {
                       System.out.println("sdt trùng lặp");
                       return;
                   }
                   else{
                       P.setPhone(P.getPhone()+" : " + phone);
                       return;
                   }
               }
            }
            this.PhoneListt.add(new PhoneList(name, phone));
            return;
        }
        this.PhoneListt.add(new PhoneList(name, phone));
    }

    @Override
    void removePhone(String name) {
        if(this.PhoneListt.size()>0){
            for(PhoneList P : this.PhoneListt){
               if(P.getName().equals(name)){
                   this.PhoneListt.remove(P);
                   return;
               }
            }
            System.out.println("không có người dùng nào tên " + name);
        }
    }

    @Override
    void updatePhone(String name, String newphone) {
        if(this.PhoneListt.size()>0){
            for(PhoneList P : this.PhoneListt){
               if(P.name == name){
                   P.setPhone(newphone);
                   return;
               }
            }
            System.out.println("không có người dùng nào tên : " + name + "! đã tạo liên hệ mới.");
            this.PhoneListt.add( new PhoneList(name, newphone));
            return;
        }
       System.out.println("list rỗng, số điện thoại đã được thêm mới");
       this.PhoneListt.add( new PhoneList(name, newphone));
    }

    @Override
    void searchPhone(String name) {
        if(this.PhoneListt.size()>0){
            for(PhoneList P : this.PhoneListt){
                if(P.name == name){
                    System.out.println("số điện thoại của "+name+ " là : "+ P.getPhone());
                    return;
                }
            }
            System.out.println("không có người dùng nào tên " + name);
            return;
        }
        System.out.println("danh sách rỗng");
    }

    @Override
    void sort() {
        Collections.sort(this.PhoneListt, new Comparator<PhoneList>(){
            public int compare(PhoneList o1, PhoneList o2){
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    
    void printList(){
        for(PhoneList P : this.PhoneListt){
            System.out.println("người dùng : " + P.name + ", sdt: "+ P.phone);
        }
        System.out.println("\n");
    }
    
}
