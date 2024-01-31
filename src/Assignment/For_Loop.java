package Assignment;
import java.util.Scanner;

public class For_Loop {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        while (true) {
            int i, number, sum = 0;
            System.out.print("\nPlease enter any number : ");
            number = scan.nextInt();

            if (number == 0) {
                break;
            }

            i = 1;

            do {
                if (number % i == 0) {
                    sum += i;
                }
                i++;
            } while (i < number);

            if (sum == number) {
                System.out.println(number + " is a perfect number");
            } else {
                System.out.println(number + " isn't a perfect number");
            }
        }
    }
}
