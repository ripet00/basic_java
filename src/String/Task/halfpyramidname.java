package String.Task;
import java.util.Scanner;

public class halfpyramidname {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Enter  the string : ");
        String string1 = scan.nextLine();
        int length = string1.length();

        // how much line
        for (int i = 0; i < length; i++) {
            // space befor char
            for (int j = 0; j < length-i-1; j++) {
                System.out.print(" ");
            }
            // the
            for (int j = 0; j <= i; j++) {
                System.out.print(string1.charAt(j)+ " ");
            }
            System.out.println();
        }
    }

}
