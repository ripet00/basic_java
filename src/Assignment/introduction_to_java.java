package Assignment;
import java.util.Scanner;

public class introduction_to_java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your birthday below (use number)");
        System.out.print("Date : ");
        int date = scan.nextInt();
        System.out.print("Month : ");
        int month = scan.nextInt();
        System.out.print("Year : ");
        int year = scan.nextInt();        

        System.out.println("hi you was born in "+date+"-"+month+"-"+year);
        scan.close();
    }
}
