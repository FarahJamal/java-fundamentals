import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class Main{
    public static String pluralize(String word,int Quantity){
        if(Quantity > 1 || Quantity ==0){
            String stmnt="I own "+Quantity +" "+word+"s";
            return stmnt ;
        }
        else{
            String stmnt2="I own "+Quantity +" "+word;

            return stmnt2;


        }
    }

    public static void flipNHeads(int number){
        int headFlips=0;
        int flipsCount=0;
        while(headFlips !=number){
        if(Math.random()<0.5){
            System.out.println("tail");
            headFlips=0;
            flipsCount++;}
        else{
            System.out.println("head");
            headFlips++;
            flipsCount++;

        }

        }
        System.out.println("It took " + flipsCount + " flips to get " + number + " heads in a row.");

    }
    public static void clock() {
        int counter = 0_000_000;
        int second2 = LocalDateTime.now().getSecond();
        while (true) {
            counter++;

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formatDateTime = now.format(format);
String formatDataExcute=NumberFormat.getNumberInstance(Locale.US).format(counter) + " Hz";
            if (1 == 1) {

                System.out.println(formatDateTime + " " + formatDataExcute);
                second2++;
                counter = 0;
            }
        }

    }
    public static void main(String[] args) {

        //long start = System.nanoTime();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your pet kind");
        String petName=sc.next();
        System.out.println("enter number of pets you have");
        int number=sc.nextInt();
        System.out.println(pluralize(petName,number));

        System.out.println("enter the number of flips you want!");

        flipNHeads(sc.nextInt());


// some time passes
//        long end = System.nanoTime();
//        long elapsedTime = end - start;
//        System.out.println(elapsedTime/1_000_000_000);

        clock();
    }
}