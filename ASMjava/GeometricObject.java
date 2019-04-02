/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASMjava;
import java.util.Date;
/**
 *
 * @author Phuc
 */
public abstract class GeometricObject {
    String color;
    boolean filled;
    Date dateCreated ;
    
    protected void GeometricObject(){
        
    };
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public String toString(){
        return this.dateCreated.toString();
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
