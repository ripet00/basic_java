package Arrays.Task;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Membuat objek dari kelas MainApp
        MainApp mainApp = new MainApp();

        // Mendapatkan array dari pengguna
        int[] dataArray = mainApp.getInputArray();

        // Memanggil metode untuk melakukan pengecekan Armstrong number
        boolean[] results = mainApp.checkArmstrongNumbers(dataArray);

        // Menampilkan hasil pengecekan
        mainApp.displayResults(dataArray, results);
    }

    // Metode untuk mendapatkan array dari pengguna
    private int[] getInputArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Masukkan nilai-nilai array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close();
        return array;
    }

    // Metode untuk melakukan pengecekan Armstrong number
    private boolean[] checkArmstrongNumbers(int[] array) {
        boolean[] results = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            results[i] = isArmstrongNumber(array[i]);
        }

        return results;
    }

    // Metode untuk mengecek apakah suatu nilai adalah Armstrong number
    private boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int digitCount = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Metode untuk menampilkan hasil pengecekan
    private void displayResults(int[] array, boolean[] results) {
        System.out.println("\nHasil pengecekan Armstrong number:");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nilai " + array[i] + ": " + results[i]);
        }
    }
}
