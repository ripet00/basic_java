package FlowControl_ForLooping.Task;
import java.util.Scanner;

public class Pyramid_Pattern {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number for high in the pyramid : ");
    int height = scan.nextInt();

    // Baris
    for (int i = 1; i <= height; i++ ) {
      // Spasinya
      for (int j = 1; j <= height - i; j++ ) {
        System.out.print(" ");
      }
      // Bintangnya
      for (int k = 1 ; k <= i; k++) {
        System.out.print("* ");
      }
      System.out.println();

    }
    scan.close();
  }
  
}
