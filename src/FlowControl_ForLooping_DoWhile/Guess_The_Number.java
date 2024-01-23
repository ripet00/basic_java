package FlowControl_ForLooping_DoWhile;
import java.util.Scanner;

public class Guess_The_Number {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int angka = (int) (Math.random() * 100);
        int tebak, count = 1;

        System.out.println("What number am I ?");

        do {
            System.out.print("guess it : ");
            tebak = scan.nextInt();

            if (tebak == angka) {
                System.out.println("<<<<Correct>>>>");
            } else if (tebak > angka) {
                System.out.println("To big");
                count++;
            } else {
                System.out.println("To small");
                count++;
            }

        } while(tebak != angka);
        System.out.println("You did it for "+count+" times");
    }
}
