/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign6;


/**
 *
 * @author Phuc
 */
public class News implements INews{
     int ID;
     String Title;
     String PublishDate;
     String Author;
     String Content;
     float AverageRate;
     float[] rateList = new float[3];
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public float getAverageRate() {
        return AverageRate;
    }
    public News(){
        System.out.println("bạn vừa tạo 1 tin mới!");
    }
    public News(int ID, String Title, String PublishDate, String Author, String Content) {
        this.ID = ID;
        this.Title = Title;
        this.PublishDate = PublishDate;
        this.Author = Author;
        this.Content = Content;
    }
    
    public void display() {
        System.out.println("title's new: " + this.Title + ".  Publish-Date is: " + this.PublishDate);
        System.out.println("Athor: " + this.Author);
        System.out.println("content: "+ this.Content);
        System.out.println("AverageRate: " + this.AverageRate);
    }
    void Calculate(){
        float total =0 ;
        for(int i =0;i< this.rateList.length;i++){
            total +=rateList[i];
        }
        this.AverageRate = total / rateList.length;
    }
    
     
}
