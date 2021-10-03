package inheritance;

public class Review {

    /*
    * should have a body,
    * an author,
    *  and a number of stars.
    * */
    double rate;
    String body;
    String author;

    public Review(double rate, String body, String author) {
        this.rate = rate;
        this.body = body;
        this.author = author;
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
// for stretch goals stuff:-
public void updateRate(double rate) {
    validateRate(rate);
    this.rate = rate;
}

    public String validateRate(double number) {

        if (number != -1 && number < 0 || number > 5){
            return "Rating is between 0 and 5";

        }
return "";

    }
    @Override
    public String toString() {
        return "Review{" +
                "rate=" + rate +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
