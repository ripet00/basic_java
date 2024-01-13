package FlowControl_IfElse;
import java.util.Scanner;

public class LogicApp {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      String username = "Rifat";
      String password = "123";

      while (true) {
        System.out.print("Enter your name : ");
        String name = scan.next();
        System.out.print("Enter your password : ");
        String pass = scan.next();
        System.out.print("Enter your password again : ");
        String confirm = scan.next();

        if ((name.equals(username)) && (pass.equals(password)) && (password.equals(confirm))) {
          try { // Time Sleep 1 second
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(" Hi welcome to your account " + username);
        } else if ((!name.equals(username)) && (pass.equals(password)) && (password.equals(confirm))) {
            try {
              Thread.sleep(1000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            System.out.println("Wrond username try again !");
        } else if ((name.equals(username)) && (pass.equals(password)) && (password.equals(confirm))) {
            try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("Wrong Password, try again !");
        } else if (!password.equals(confirm)) {
            try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("Confirm password doesn't match, try again");
        } else {
            try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("Username : " + username + " & Password : " + password + " Doesn't exist");
        }

      }
    }

  }
}
