package FlowControl_IfElse.Tugas;
import java.util.Scanner;

public class Airline_boarding_system {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {

      while (true) {
        System.out.print("What is your name : ");
        String name = scan.next();
        System.out.print("How old are you : ");
        int age = scan.nextInt();

        if (age < 17 ) {
          System.out.println("Sorry you age doesn,t require for the flight");
          break;
        }


        System.out.println("\nWelcome " + name + " to Corona checking centre, \nit is mandatory to get checked for corona symptomps before you board the flight");
        System.out.println("Please answer the following details with full honesty\n ----------");
        System.out.println("Instruction for user : type (Y) for yes & (N) for no");

        System.out.println("1. Have you been feeling feverish since past few days ?");
        String fever = scan.next();
        System.out.println("2. Have you been feeling loss of taste since past few days ?");
        String taste = scan.next();
        System.out.println("3. Have you been feeling loss of smell since past few days ?");
        String smell = scan.next();
        System.out.println("4. Are you having cough problem since past few days ?");
        String cough = scan.next();
        System.out.println("5. Have you been tired since past few days ?");
        String tired = scan.next();

        // String isPositive = ((fever.equals(Y)) && (taste.equals(Y)) && (smell.equals(Y))&& (cough.equals(Y)) && (tired.equals(Y)));
        boolean isPositive = (fever.equals("Y") && taste.equals("Y") && smell.equals("Y") && cough.equals("Y") && tired.equals("Y"));

        if (isPositive) {
          System.out.println(name + ", you seem to be corona positive based on your symptoms.");
          System.out.println("Sorry we can't board you on the flight. Sorry for the inconvenience");
          System.out.println("###########################\n");
        } else {
          System.out.println("Are you diagnosed with COVID-19 ? ");
          String covid = scan.next();
          boolean diagnosed = (covid.equals("Y"));
            if (diagnosed) {
              System.out.println("Failed. Boarding process incomplete");
            } else {
                System.out.print("Do you have valid ticket ?");
                String ticket = scan.next();
                boolean tickets = (ticket.equals("Y"));
                System.out.print("Do yo want your luggage checked in ?");
                String luggage = scan.next();
                boolean Luggage = (luggage.equals("Y"));


                boolean canboard = (tickets && Luggage && !isPositive);
                if (canboard) {
                  System.out.println("=====================");
                  System.out.println("Your name is "+ name);
                  System.out.println("Your age is "+ age);
                  System.out.println("Your COVID status is "+ isPositive);
                  System.out.println("Boarding process completed successfully. Have a nice trip "+ name);
                  System.out.println("=====================\n");

                }
            }
        }   
          

      }
    }
  }
}
