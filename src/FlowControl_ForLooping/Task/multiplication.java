package FlowControl_ForLooping.Task;
import java.util.Scanner;

public class multiplication {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int result;

    System.out.print("Enter the number you want to multiplication : ");
    int angka = scan.nextInt();

    System.out.println("hasil kali tersebut adalah berikut");
    for (int i = 1; i <= 10; i++) {
      result = angka * i;
      System.out.println(angka +" x "+i+" = "+result);
    }
    scan.close();
  }
}
