package Assignment;
import java.util.Scanner;

public class FlowControl_ifelse {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Hello, please enter one of the number in the week (1 - 7) : ");
        int day = scan.nextInt();

        if (day == 1) {
            System.out.println("Motivational Monday");
        } else if (day == 2) {
            System.out.println("We enter Tuesday");
        } else if (day == 3) {
            System.out.println("Keep smile on Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday, half week more");
        } else if (day == 5) {
            System.out.println("Friday last weekday");
        } else if (day == 6) {
            System.out.println("Lets sleep on Saturday");
        } else if (day == 7) {
            System.out.println("How about a picnic on Sunday");
        } else {
            System.out.println("Invalid day of the week :(");
        }
    }
}
