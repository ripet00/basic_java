package FlowControl_ForLooping;
import java.util.Scanner;

public class pattern {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the number for rows : ");
    int row = scan.nextInt();

    for (int r = 1; r <= row; r++) {
      for (int c = 1; c <= r; c++){
        System.out.print(" * ");
      }
      System.out.println();

    }

    scan.close();
  }
}
