package FlowControl_IfElse.Tugas;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan bilangan (Enter a number): ");
            int a = scan.nextInt();

            if (a > 0 && a % 2 == 0) {
                System.out.println("Number " + a + " is positive and even");
            } else if (a > 0 && a % 2 != 0) {
                System.out.println("Number " + a + " is positive and odd");
            } else if (a < 0 && a % 2 == 0) {
                System.out.println("Number " + a + " is negative and even");
            } else if (a < 0 && a % 2 != 0) {
                System.out.println("Number " + a + " is negative and odd");
            } else {
                System.out.println("You entered 0. Break the program");
                break;
            }
            
        }
        scan.close();
    }
}