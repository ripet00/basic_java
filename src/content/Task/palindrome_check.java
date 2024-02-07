package content.Task;
import java.util.Scanner;

public class palindrome_check {
    private static Scanner scan;

    public static void main(String[] args) {
      scan = new Scanner(System.in);
      
      while (true) {
        System.out.print("\nEnter the string : ");
        String kata = scan.nextLine();

        // prosedural programming, the code will run sequantifly
        if (kata.equals("0")) {
            System.out.println("Exit the program");
            break;
        }
        if (isPalindrome(kata)) {
            System.out.println(kata +" is a palindrome");
        }
        else {
            System.out.println(kata + " isn't a palindrome");
        }
      }
    }
    private static boolean isPalindrome(String check) {
        String clean = check.replace(" ","").toLowerCase();

        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}
