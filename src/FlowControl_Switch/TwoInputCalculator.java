package FlowControl_Switch;
import java.util.Scanner;

public class TwoInputCalculator {
  // Declaring main method
  public static void main(String[] args) {
    // Declaring all variables
    float first, second, result;
    int choice;
    try (Scanner scan = new Scanner(System.in)){

      // Creating Infinite while loop
      while (true) {
        System.out.println("Welcome to calculator please make your choice");
        System.out.println("------------------");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Quit ");
        System.out.println("------------------\n");

        // Asking user to make choice
        System.out.println("Make your choice : ");
        choice = scan.nextInt();

        switch (choice) {
          case 5:
            System.out.println("You exit the calculator");
            System.exit(0);
          
          default:
            System.out.println("Invalid choice");
            break;
        }

        System.out.println("Enter the first number : ");
        first = scan.nextFloat();
        System.out.println("Enter the second number : ");
        second = scan.nextFloat();

        switch (choice) {
          case 1:
            result = first + second;
            System.out.println("Ther sum of the number is = "+ result + "\n===========\n");
            break;

          case 2:
            result = first - second;
            System.out.println("Ther sum of the number is = "+result + "\n===========\n");
            break;
          
          case 3:
            result = first * second;
            System.out.println("Ther sum of the number is = "+result + "\n===========\n");
            break;

          case 4:
            result = first / second;
            System.out.println("Ther sum of the number is = "+result + "\n===========\n");
            break;


        }
      }
    }

  }
}
