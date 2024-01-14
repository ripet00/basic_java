package FlowControl_While_dowhile;
import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {

            try (Scanner scan = new Scanner(System.in)) {
                while (true) {
                    System.out.print("Enter the number to check if it's an Armstrong number : ");
                    int number = scan.nextInt();

                    if (isArmstrongNumber(number)) {
                        System.out.println(number + " is an Armstrong number.");
                    } else {
                        System.out.println(number + " isn't Armstrong number.");
                    }

                }
            }
    }

    private static boolean isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0, n = 0;

        // Assign the second entered number to a variable
        originalNumber = num;

        // Count the number of the digits in the number
        for (; originalNumber != 0; originalNumber  /= 10, ++n);

        // Assign the entered number to variable again
        originalNumber = num;

        // Calculate the result;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        } 
        return result == num;
    }
}
