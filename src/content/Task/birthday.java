package content.Task;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.time.Month;
import java.time.format.TextStyle;

public class birthday {
    private static Scanner scan;
    private static int date;
    private static int month;
    private static int year;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.nextLine();

        Date birthDate = getbirthdate();
        String monthString = getMonthString(month);

        int daysPassed = calculate_days(birthDate);

        System.out.println("________________________________");
        System.out.println("Kamu lahir pada "+ date + " " + monthString + " " + year);
        System.out.printf("Kamu telah hidup selama %d days, %s%n", daysPassed, name);
    }

    private static Date getbirthdate() {
        scan = new Scanner(System.in);
    
        while (true) {
            try {
                System.out.print("Enter the date of your birth : ");
                date = scan.nextInt();
                System.out.print("Enter the month of your birth : ");
                month = scan.nextInt();
                System.out.print("Enter the year of your birth : ");
                year = scan.nextInt();
    
                String dateString = String.format("%d-%d-%d", year, month, date);
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
                return dateFormat.parse(dateString);
            } catch (ParseException e) {
                System.out.println("Invalid input. Please enter valid numeric values.");
                scan.nextLine(); // Clear the invalid input
            }
        }
    }
    
    private static int calculate_days(Date birthDate) {
        long milisecondInAday = 24 * 60 * 60 * 1000;
        Date today = new Date();
        long daysPassed = (today.getTime() - birthDate.getTime()) / milisecondInAday;

        return (int) daysPassed;
    }

    private static String getMonthString(int month) {
        Month bulan = Month.of(month);

        return bulan.getDisplayName(TextStyle.FULL, Locale.getDefault());
    }
}
