package Arrays;
import java.util.Scanner;

public class input_output {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int[] number = {1,2,3,4,5};
        String[] words = {"a", "b", "c", "d","e"};

        // System.out.println("Enter 5 numbers : ");
        // // Store input from user to array
        // for (int i = 0; i < 5; i++) {
        //     number[i] = scan.nextInt();
        // }

        // System.out.println("The numbers are : ");
        // // print out array elements
        // for (int n = 0; n < 5; n++) {
        //     System.out.print(number[n] + "  ");
        // }

        for( int a = 0; a < 5; a++) {
            System.out.print(number[a] + "  ");
        }

        // System.out.println("\nEnter 5 words : ");
        // // store words
        // for (int w = 0; w < 5; w++) {
        //     words[w] = scan.next();
        // }

        // System.out.println("The words are : ");
        // // print out array elements
        // for (int m = 0; m < 5; m++) {
        //     System.out.print(words[m] + "  ");
        // }
        System.out.println("\n");
        for (int x = 0; x < 5 ; x++) {
            System.out.print(words[x] + "  ");
        }

        System.out.println();
        scan.close();
    }
}
