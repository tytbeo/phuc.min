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
public class tamGiacVuong extends tamGiac {
    
    void Check(){
         if ((this.a * this.a == this.b *this.b + this.c * this.c) || (this.b *this.b == this.a * this.a + this.c * this.c) || (this.c *this.c == this.b * this.b + this.a * this.a)) {
	System.out.println("Đây là tam giác vuông !");
         }
         else {
             System.out.println("Đây không phải tam giác vuông ! tam giác vuông là tam giác có cạnh bình phương huyền bằng tổng bình phương 2 cạnh còn lại");
         }
    }
}
