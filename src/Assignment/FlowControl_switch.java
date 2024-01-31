package Assignment;
import java.util.Scanner;

public class FlowControl_switch {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        
        System.out.println("----WELCOME----");
        System.out.println("Choose one of this to input the temperature");
        System.out.println("1. input as a Celcius");
        System.out.println("2. input as a Farenheit");
        System.out.print("\nEnter your choice : ");
        int choice1 = scan.nextInt();

        System.out.print("\nInput the temperature : ");
        double temp = scan.nextDouble();

        System.out.println("\nChoose one of this temperature for the output");
        System.out.println("1. output as a Celcius");
        System.out.println("2. output as a Farenheit");
        System.out.print("\nEnter your choice : ");
        int choice2 = scan.nextInt();

        switch (choice2) {
            case 1:
                switch (choice1) {
                    case 1:
                        System.out.println("There is nothing change, the temperature still same "+temp+"°C");
                        break;
                    
                    case 2:
                        double Celcius = (5/9) * (temp - 32);
                        System.out.println("The resulf from Farenheit to celcius is = "+Celcius+"°C");
                        break;

                    default:
                        System.out.println("invalid choice");
                        break;
                }
                break;
            
            case 2:
                switch (choice1) {
                    case 1:
                        double farenheit = 1.8 * temp + 32;
                        System.out.println("There is nothing change, the temperature still"+farenheit+"°C");
                        break;
                    
                    case 2:
                        System.out.println("There is nothing change, the temperature still same "+temp+"°F");
                        break;

                    default:
                        System.out.println("invalid choice");
                        break;
                }
                break;
    
        } 
    }
}
