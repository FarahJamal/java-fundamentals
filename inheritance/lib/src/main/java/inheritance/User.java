package inheritance;

import java.util.*;

public class User extends Review{
    String name;


 public void findReviews(List<Review> rev,String n) {
     for (Review element : rev) {

         if (element.toString().contains(n)) {
             System.out.println("Sorry "+n+" you cannot add multiple reviews");


         }
         else {
             Restaurant res=new Restaurant("Alakeel","JD");
             res.addReview(2.8,"people works there so rude!","Omar");

         }
         }
     }


}
