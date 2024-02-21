package calculator;
import java.util.Scanner;

public class calculator {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to calculator");
            System.out.print("Enter the first number : ");
            int a = scan.nextInt();
            System.out.print("Enter the second number : ");
            int b = scan.nextInt();
            System.out.println();

            System.out.println("____________________");
            System.out.println("1) '+' operation ");
            System.out.println("2) '-' operation ");
            System.out.println("3) '*' operation ");
            System.out.println("4) '/' operation ");
            System.out.println("5) '//' operation ");
            System.out.println("6) '%' operation ");
            System.out.println("7) Quit operation ");
            System.out.println("____________________");
            System.out.print("Choose your choice : ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    kerja(a, b, "penjumlahan");
                    break;
                case 2:
                    kerja(a, b, "pengurangan");
                    break;
                case 3:
                    kerja(a, b, "perkalian");
                    break;
                case 4:
                    kerja(a, b, "pembagian");
                    break;
                case 5:
                    kerja(a, b, "long-division");
                    break;
                case 6:
                    kerja(a, b,"modulo");
                    break;
                case 7:
                    System.out.println("Exit the program");
                    return;
                default:
                    break;
            }
        }
        
    }

    private static void kerja(int a, int b, String operation) {
        int result = 0;
        operator operasi = new operator();

        switch (operation) {
            case "penjumlahan":
                result = operasi.penjumlahan(a, b);
                System.out.println(a + " + " + b + " = " + result);
                break;
            case "pengurangan":
                result = operasi.pengurangan(a, b);
                System.out.println(a + " - " + b + " = " + result);
                break;
            case "perkalian":
                result = operasi.perkalian(a, b);
                System.out.println(a + " * " + b + " = " + result);
                break;
            case "pembagian":
                result = operasi.pembagian(a, b);
                System.out.println(a + " / " + b + " = " + result);
                break;
            case "lupa":
                result = operasi.longdivision(a, b);
                System.out.println(a + "//" + b + " = " + result);
                break;
            case "modulo":
                result = operasi.modulo(a, b);
                System.out.println(a + " % "+b+" = "+result);
                break;
        }
    }
}
