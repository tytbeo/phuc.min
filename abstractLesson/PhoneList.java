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
public class PhoneList {
    public String name;
    public String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PhoneList(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
