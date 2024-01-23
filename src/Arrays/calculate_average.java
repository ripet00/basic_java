package Arrays;
import java.util.Scanner;

public class calculate_average {
    private static Scanner scan;
    public static void main(String[] args) {
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

        // Calculate the average of the numbers in the array
        double average = calculateAverage(numbers);

        // Display the result
        System.out.println("The average of the number is = " + average);
    }

    // method to calculate the average of an array
    private static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0; // avoid division by zero
        }

        int sum = 0;

        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
