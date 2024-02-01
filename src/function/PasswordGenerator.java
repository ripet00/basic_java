package function;
import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    private static Scanner scan;
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTER = "!$%&|[](){}:;.,*+-#@<>~";

    public static String generatePassword(int length, boolean lowerCase, boolean upperCase, boolean digits, boolean specialCharacter) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        String possibleCharacters = "";
        if (lowerCase) {
            possibleCharacters += LOWER_CASE;
        }
        if (upperCase) {
            possibleCharacters += UPPER_CASE;
        }
        if (digits) {
            possibleCharacters += DIGITS;
        }
        if (specialCharacter) {
            possibleCharacters += SPECIAL_CHARACTER;
        }

        for (int i = 0 ; i< length; i++) {
            int randomIndex = random.nextInt(possibleCharacters.length());
            password.append(possibleCharacters.charAt(randomIndex));
        }

        return password.toString();
    }
    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Enter the length of the password : ");
        // Integer its to convert a string representation of a numarical value
        // user can input string value become a boolean value (true or false)
        int length = Integer.parseInt(scan.nextLine());
        // int length = scan.nextInt();

        System.out.print("Do you want to use lower case (y / n) : ");
        boolean lowerCase = scan.nextLine().equalsIgnoreCase("y");
        if (!lowerCase && !scan.nextLine().equalsIgnoreCase("n")) {
            lowerCase = false; // Assuming default behavior is to use lower case
        }

        System.out.print("Do you want to use upper case (y / n) : ");
        boolean upperCase = scan.nextLine().equalsIgnoreCase("y");
        if (!upperCase && !scan.nextLine() .equalsIgnoreCase("n")) {
            upperCase = false;
        }

        System.out.print("Do you want to use digits (y / n) : ");
        boolean digits = scan.nextLine().equalsIgnoreCase("y");
        if (!digits && !scan.nextLine() .equalsIgnoreCase("n")) {
            digits = false;
        }

        System.out.print("Do you want to use special character (y / n) : ");
        boolean specialCharacter = scan.nextLine().equalsIgnoreCase("y");
        if (!specialCharacter && !scan.nextLine() .equalsIgnoreCase("n")) {
            specialCharacter = false;
        }

        String password = generatePassword(length, lowerCase, upperCase, digits, specialCharacter);

        System.out.println("Your password generated to : "+ password);
    }
}
