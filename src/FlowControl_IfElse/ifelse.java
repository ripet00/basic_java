package FlowControl_IfElse;
import java.util.Scanner;

public class ifelse {
  // to fin negative or positive integer
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan bilangan : ");
    int a = scan.nextInt();

    if ((a > 0)) {
      System.out.println("The number you input is positive");
    } else if ((a < 0)) {
      System.out.println("The number you input is negative ");
    } else {
      System.out.println("You entered 0)");
    }
    scan.close();
  }
}
