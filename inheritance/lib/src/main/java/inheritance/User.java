package inheritance;

import java.util.ArrayList;

public class User extends Review{
    String name;


 public void findReviews(ArrayList<Review> rev,String n) {
     for (Review element : rev) {

         if (element.toString().contains(n)) {
             System.out.println("Sorry "+n+" you cannot add multiple reviews");


         }
         else {
             Review review=new Review();
             review.updateRate(2.8);
         }
         }
     }

    @Override
    public String toString() {
        return "User{" +
                "rate=" + rate +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
