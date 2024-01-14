package FlowControl_While_dowhile;
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Masukkan angka yang ingin dikalikan berurut : ");
            int angka = scan.nextInt();

            int i = 1;
            while (i <= 10) {
                int result = angka * i;
                System.out.println(angka + " X " + i +" = " + result );
                i++;
            }
        }
        


    }
}
