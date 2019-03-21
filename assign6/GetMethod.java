/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Phuc
 */
public class GetMethod {
    
    public GetMethod(){
        System.out.println("bắt đầu chương trình!");
    }
    
    
     Scanner sc = new Scanner(System.in);
     ArrayList<News> NewsList = new ArrayList<>();
     
    void insertNews(){
            News nhapTin = new News();
            System.out.println("hãy nhập tiêu đề bài viết: ");
            nhapTin.Title = sc.nextLine();
            
            System.out.println("hãy nhập ngày phát hành: ");
            nhapTin.PublishDate = sc.nextLine();
            
            System.out.println("hãy nhập tên  tác giả: ");
            nhapTin.Author = sc.nextLine();
            
            System.out.println("hãy nhập nội dung: ");
            nhapTin.Content = sc.nextLine();
            
            System.out.println("hãy nhập 3 đánh giá: ");
            nhapTin.rateList[0] = sc.nextFloat();
            sc.nextLine();
            nhapTin.rateList[1] = sc.nextFloat();
            sc.nextLine();
            nhapTin.rateList[2] = sc.nextFloat();
            sc.nextLine();
            
            this.NewsList.add(nhapTin);
        }
    void ShowList(){
            if(NewsList.size()==0){
                System.out.println("chưa có bài viết nào! hãy nhập bài viết");
                return;
            }
            for (News each: NewsList){
                each.display();
            }
            
    }
    
    void AvG(){
        if(NewsList.size()==0){
                System.out.println("chưa có bài viết nào! hãy nhập bài viết");
                return;
            }
        for (News each: NewsList){
                each.Calculate();
                each.display();
            }
    }
}
