package Arrays.Task;
import java.util.Scanner;

public class reverse_result {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen : ");
        int size = scan.nextInt();
        int[] array = new int[size];

        // Input nilai
        for (int i = 0; i < size ; i++) {
            System.out.println("Masukkan nilai ke " + (i+1));
            array[i] = scan.nextInt();
        }

        // Reverse
        int x = array.length -1;
        System.out.println("Reverse : ");
        for (int j = x; j >=0 ; j--){
            System.out.print(array[j]+ " ");
        }

        // Penjumlahan array
        int sum = 0;
        for (int k = 0; k < size;k++) {
            sum += array[k];
        }
        System.out.println("\nHasil penjumlahan array = "+ sum);
    }

}
