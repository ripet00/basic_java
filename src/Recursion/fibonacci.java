package Recursion;
import java.util.Scanner;

public class fibonacci {
    public static Scanner scan;

    private static int fibb(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibb(n-1) + fibb(n-2);
        }
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = scan.nextInt();

        int num = fibb(number);
        System.out.println("the fibbonaci of "+number+ " is = "+num);
    }
}
