package FlowControl_ForLooping;
import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the number for computing : ");
    int number = scan.nextInt();
    int produk = 1;

    for (int i = 1; i <= number ; i++) {
      produk *= i;
    }

    System.out.println("Factorial number of "+number+ " is "+produk);

    scan.close();
  }
}
