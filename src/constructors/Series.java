package constructors;
import java.util.Scanner;

public class Series {
    private static Scanner scan;

    // Instance variable to state input & series type
    int n, x, k, series_number;

    // Constructor to initialize a series object for series
    Series(int number_of_terms) {
        n = number_of_terms;
        series_number = 1; // set series number to 1
    }

    // Constructor to initilize a series object for series 2
    Series(int number_of_terms, int value_of_x) {
        n = number_of_terms;
        x = value_of_x;
        series_number = 2;  // set number to 2
    }

    // Constructor to initilize
    Series(int number_of_terms, int value_of_x, int power) {
        n = number_of_terms;
        x = value_of_x;
        k = power;
        series_number = 3;
    }
    // Method to calculate the sum of the series
    double calculate() {
            double sum = 0.0;   //variable to store the sum of the series
            double power_term;  // variable to store the power term
            double fact = 1;    // variable to calculate factorial

            if (series_number == 1) {           // series 1 calculation
                for (int i = 1; i <= n; i++) {
                    fact *= i;                  // calculate factorial
                    sum += fact;                // add factorial to sum
                }
            } else if (series_number == 2) {       // series 1 calculation
                for (int i = 1; i <= n; i++) {
                    power_term = Math.pow(x, i);
                    fact *= i;                  // calculate factorial
                    sum += (fact / power_term);   // add factorial to sum
                }
            } else {
                for (int i = 1; i <= n; i++) {
                    power_term = Math.pow(x, k);
                    fact *= i;                  // calculate factorial
                    sum += (fact / power_term);   // add factorial to sum
                }
            }
            return sum;
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Enter number of terms for the series : ");
        int a = scan.nextInt();     // read value of term
        System.out.print("Enter value of x for the series : ");
        int b = scan.nextInt();     // read value of x
        System.out.print("Enter value of k for the series : ");
        int c = scan.nextInt();     // read value of power

        // Create series object for diferent series type
        Series series_1 = new Series(a);
        Series series_2 = new Series(a, b);
        Series series_3 = new Series(a, b, c);

        // Calculate the sum of each series
        double result1 = series_1.calculate();
        double result2 = series_2.calculate();
        double result3 = series_3.calculate();

        // Print the sum of each series
        System.out.println("Sum of series 1 : "+result1);
        System.out.println("Sum of series 2 : "+result2);
        System.out.println("Sum of series 3 : "+result3);
    }
}
