package Assignment;
import java.util.Scanner;

public class Loops_Statements_While_Loops {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = scan.nextInt();

        int first = 0, second = 1, count = 0;

        while (count < n) {
            System.out.print(first +" ");

            int next = first + second;
            first = second;
            second = next;

            count++;
        }

    }
}
