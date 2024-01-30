package String;
import java.util.Scanner;

public class Password_Checker {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int PasswordLength = 8, upChars = 0, lowChars = 0;
        int special = 0, digits = 0;
        char ch;

        System.out.println("_____ Rules to create a Password _____");
        System.out.println("1) The Password must contain at least one uppercase character");
        System.out.println("2) The Password must contain at least one lowercase character");
        System.out.println("3) The Password must contain at least 8 characters long");
        System.out.println("4) The Password must contain at least 1 digit (0 - 9)");
        System.out.println("5) The Password must contain at least 1 special character");
        System.out.println("6) The Password must not contain '<' or '>'");

        System.out.print("\nEnter the password : ");
        String userPassword = scan.nextLine();

        int total = userPassword.length();

        if (total < PasswordLength) {
            System.out.println("\nThe password's length has to be of 8 characters or more");
            return;
        } else {
            // To check character from user string
            for (int i = 0; i < total; i++) {
                ch = userPassword.charAt(i);
                if (Character.isUpperCase(ch)) {
                    upChars++;
                } else if (Character.isLowerCase(ch)) {
                    lowChars++;
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else {
                    if (ch == '<' || ch == '>') {
                        System.out.println("\nTHe Password is Malicious !!");
                        return;
                    } else {
                        special++;
                    }
                }
            }
        }

        if (upChars != 0 && lowChars != 0 && digits != 0 && special != 0) {
            if (total >= 12) {
                System.out.println("\nThe strength of password is strong");
            } else {
                System.out.println("\nThe strength of password is medium");
            } 
            System.out.println("\n___ The Password contains ___");
            System.out.println("Uppercase Character : " + upChars);
            System.out.println("Lowercasae Character : " + lowChars);
            System.out.println("Digit : " + digits);
            System.out.println("Special Character : " + special);
        } else {
            if (upChars == 0)
                System.out.println("\nThe Password must contain at least one uppercase character");
            else if (lowChars == 0)
                System.out.println("\nThe Password must contain at least one lowercase character");
            else if (digits == 0)
                System.out.println("\nThe Password must contain at least one digit");
            else if (special == 0)
                System.out.println("\nThe password must contain at least one special character");  
        }
    }
}
