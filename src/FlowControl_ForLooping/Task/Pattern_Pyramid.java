package FlowControl_ForLooping.Task;
import java.util.Scanner;

public class Pattern_Pyramid {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number for the height of the pyramid: ");
        int height = scan.nextInt();

        for (int i = 1; i <= height; i++) {
            // Print spaces before the asterisks
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  "); // You can adjust the number of spaces as needed
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line after each row
        }

        scan.close();
    }
}
