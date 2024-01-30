package content;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class days_passed {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scan.nextLine();

        Date birthDate = getbirthdate();

        int daysPassed = calculate_days(birthDate);

        System.out.println("________________________________");
        System.out.printf("Kamu telah hidup selama %d days, %s%n", daysPassed, name);
    }

    private static Date getbirthdate() {
        scan = new Scanner(System.in);

        System.out.print("Enter the date of your birth : ");
        int date = scan.nextInt();
        System.out.print("Enter the month of your birth : ");
        int month = scan.nextInt();
        System.out.print("Enter the year of your birth : ");
        int year = scan.nextInt();

        String dateString = String.format("%d-%d-%d", year, month, date);
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");

        // Exceptional the error
        try{
            return dateformat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private static int calculate_days(Date birthDate) {
        long milisecondInAday = 24 * 60 * 60 * 1000;
        Date today = new Date();
        long daysPassed = (today.getTime() - birthDate.getTime()) / milisecondInAday;

        return (int) daysPassed;
    }
}
