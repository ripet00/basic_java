package Pertemuan_4_21_Desember_2023;
import java.util.Scanner;

public class additional {
    public static void main(String[] args) {
        int exitingSubject = 10;
        int additionalSubject;
        boolean hasAdditionalSubject;

        System.out.println("Number of exciting subject in  yout course this year : "+ exitingSubject);

        Scanner scan = new Scanner(System.in);

        System.out.println("Have you taken additional subject ? (0: No / 1: Yes)");
        hasAdditionalSubject = scan.nextInt() == 1;

        if (hasAdditionalSubject){
            System.out.println("Enter the number of additional subject taken by you :");
            additionalSubject = scan.nextInt();
            exitingSubject += additionalSubject;
            System.out.println("Update number of subject area"+ exitingSubject);

        } else {
            System.out.println("You still have "+ exitingSubject + "subject in your course !");
        }
        scan.close();

    }
}
