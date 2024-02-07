package Recursion;
import java.util.Scanner;

public class Recursion_function {
    private static Scanner scan;

    // function to call factorial
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    // function sequence calculation of fibonacci
    public static int fibonacci(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n-2);
        }
    }

    // function counts the number of digits
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumDigits(n/10);
        }
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        // input for factorial
        System.out.print("Enter a number to find factorial : ");
        int factorialInput = scan.nextInt();
        int factorialResult = factorial(factorialInput);
        System.out.println("Factorial of "+ factorialInput + " is "+ factorialResult);

        // input for fibonacci sequence
        System.out.print("Enter the number of terms for fibonacci series : ");
        int fibonaccilInput = scan.nextInt();
        int fibonacciResult = factorial(fibonaccilInput);
        System.out.println("Sum of Factorial series up to "+ fibonaccilInput + " is "+ fibonacciResult);

        // input for the number digits
        System.out.print("Enter the number of terms for fibonacci ");
        int sumDigitsInput = scan.nextInt();
        int sumDigitsResult = factorial(sumDigitsInput);
        System.out.println("Sum of digits of "+ sumDigitsInput + " is "+ sumDigitsResult);
    }
}
