package FlowControl_While_dowhile;
import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // BSS
        int number;
        int sum = 0;

        System.out.print("Enter the number : ");
        number = scan.nextInt();
        while (number >= 0) {
            sum += number;
            System.out.print("Enter a number : ");
            number = scan.nextInt();
        }
        System.out.println("The sum is "+ sum);

        scan.close();
    }
}
