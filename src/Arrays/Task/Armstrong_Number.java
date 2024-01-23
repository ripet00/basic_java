package Arrays.Task;
import java.util.Scanner;

public class Armstrong_Number {
    private static Scanner scan;

    public static void main(String[] args) {
        
        // make and fill the array
        int[] angka = inputarray();

        // pengecekan armstongnumber
        boolean[] hasil = check(angka);

        // menampilkan hasil pengecekan
        cetakhasil(angka, hasil);
    }
    private static int[] inputarray() {
        scan = new Scanner(System.in);

        // get the size of the array from the user
        System.out.print("Enter the number of elements in the array : ");
        int size = scan.nextInt();

        // create an array of the specified size
        int[] numbers = new int[size];

        // get the elements of the array from the user 
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < size ; i++) {
            System.out.println("Element "+ (i + 1) + " : ");
            numbers[i] = scan.nextInt();
        }        
        return numbers;
    }

    private static boolean[] check(int[] array) {
        boolean[] hasil = new boolean[array.length];

        // memeriksa setiap nilai dengan bantuan method isArmstrongnumber
        for (int i = 0; i < array.length; i++) {
            hasil[i] = isArmstrongNumber(array[i]);
        }
        return hasil;
    }

    private static boolean isArmstrongNumber(int num) {
        // mengecek nilai satu persatu

        int originalNumber = num;
        int digitCount = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }

        return sum == originalNumber;
    }

    private static void cetakhasil(int[] array, boolean[] hasil) {
        System.out.println("\nHasil pengecekan armstrongnumber : ");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nilai "+array[i]+ " : " + hasil[i]);
        }
    }
}
