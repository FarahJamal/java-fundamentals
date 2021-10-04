package inheritance;

import java.util.List;

public class Review {

    /*
    * should have a body,
    * an author,
    *  and a number of stars.
    * */
    double rate;
    String body;
    String author;
    String movieName;

    public Review(double rate, String body, String author) {
        this.rate = rate;
        this.body = body;
        this.author = author;
    }
    public Review(String body,String author,double rate,String movieName){

        this.body=body;
        this.author=author;
        this.rate=rate;
        this.movieName=movieName;
    }

    public Review() {
    setRate(rate);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if(rate <= 5 && rate >= 0) {
            this.rate = rate;
        }else {
            System.out.println("Enter review between 5 and 0");
        }
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    public void updateStars(String author,double newStar, Restaurant restaurantCurrent){
        for(Review restaurants : restaurantCurrent.reviews){
            if(restaurants.author==author){
                this.rate=newStar;
                //restaurantCurrent.calculateStars();
                System.out.println("from update stars"+newStar+" "+restaurantCurrent.reviews);
                return;
            }

        }
        System.out.println("type in correct author, no match found");
    }

    public String validateRate(double number) {

        if (number != -1 && number < 0 || number > 5){
            return "Rating is between 0 and 5";

        }
return "";

    }


  @Override
    public String toString() {
        if(this.movieName==null){
        return "Review{" +
                "rate=" + rate +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
        }
        else{
            return "Review{" +
                "rate=" + rate +
                        ", body='" + body + '\'' +
                        ", author='" + author + '\'' +
                        ", movieName='" + movieName + '\'' +
                        '}';
        }
    }
}
