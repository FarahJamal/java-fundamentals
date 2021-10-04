package inheritance;

import java.util.ArrayList;

public class Restaurant extends Review implements AddReview {

    /*
    * Each Restaurant should have a name,
    * a number of stars betweeen 0 and 5,
    * and a price category (i.e. number of dollar signs).
    * */

    String name;
    double stars;
    String priceCat="JD";

    //
     int starsSum=0;
     int revCounter=0;
//
protected ArrayList<Review> reviews=new ArrayList<>();


    public Restaurant(String name, String priceCat) {
        this.name = name;
        this.priceCat = priceCat;
    }
@Override
public void addReview(double rate,String body,String author){
        if (rate>0&&rate<=5){
            Review rev=new Review(rate,body,author);
            this.starsSum+= rev.getRate();
            this.revCounter+=1;

            rev.rate=this.starsSum/this.revCounter;
            this.reviews.add(rev);
        }else {
            System.out.println("Please add number beteen 0 and 5");
            return;
        }

    }
    public void modifyReview(String name){
        User user=new User();
        user.findReviews(reviews,name);
        updateRate(name,2.1);
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + starsSum/revCounter +
                ", priceCat='" + priceCat + '\'' +
                "}\n "+ "all reviews: "+" \n"+reviews;
    }


}
