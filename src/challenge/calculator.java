package challenge;
import java.util.Scanner;

public class calculator {
    private static Scanner scan;

    private static int addition(int x, int y) {
        return x + y;
    }

    private static int subsctraction(int x , int y) {
        return x - y;
    }

    private static int multiplication(int x, int y) {
        return x + y;
    }

    private static int division(int x , int y) {
        return x / y;
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n<< Welcome to Claaculator >>");
            System.out.println("--------------------");

            System.out.print("Enter the first number : ");
            int a = scan.nextInt();
            System.out.print("Enter the second number : ");
            int b = scan.nextInt();
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for substraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 for quit the program");
            System.out.println("--------------------");
            System.out.print("choose your option : ");
            int choice = scan.nextInt();

            int result;
            switch (choice) {
                case 1:
                    result = addition(a, b);
                    System.out.println("result of "+a+  " + " + b + " = " + result);
                    break;
                case 2:
                    result = subsctraction(a, b);
                    System.out.println("result of "+a+  " - " + b + " = " + result);

                    break;
                case 3:
                    result = multiplication(a, b);
                    System.out.println("result of "+a+  " * " + b + " = " + result);
                    break;
                case 4:
                    result = division(a, b);
                    System.out.println("result of "+a+  " / " + b + " = " + result);
                    break;
                case 5:
                    System.out.println("~~ Exit the program ~~");
                    System.exit(a);
                default:
                    break;
            }
        }  
    }
}
