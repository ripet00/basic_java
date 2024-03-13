package OOP.Polymorphysm;
import java.util.Scanner;

public class Temperature_Converter {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        
        while (true) {
            for (int i = 0; i< 40;i++) {
                System.out.println("-");
            }
            System.out.println("Choose the temperature input ");
            System.out.println("1. Celcius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.print("Enter the choice number : ");
            int choice = scan.nextInt();

            System.out.print("Input the temperature : ");
            double temperature = scan.nextDouble();

            for (int i = 0; i< 40;i++) {
                System.out.println("-");
            }
            System.out.println("Choose the output of the temperature ");
            System.out.println("1. Celcius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.print("Enter the choice number : ");
            int choice2 = scan.nextInt();

            converTemperature rumus = null;


            if (choice == 1) {
                if (choice2 == 1) {
                    System.out.println(" = "+temperature);
                }
                if (choice2 == 2) {
                    rumus = new celciustofahrenheit();
                }
                if (choice2 == 3) {
                    rumus = new celciustokelvin();
                }
            }
            else if (choice == 2) {
                if (choice2 == 1) {
                    rumus = new fahrenheittocelcius();
                }
                if (choice2 == 2) {
                    System.out.println(" = "+temperature);
                }
                if (choice2 == 3) {
                    rumus = new fahrenheittokelvin();
                }
            }
            else if (choice == 3) {
                if (choice2 == 1) {
                    rumus = new kelvintocelcius();
                }
                if (choice2 == 2) {
                    rumus = new kelvintofahrenheit();
                }
                if (choice2 == 3) {
                    System.out.println(" = "+temperature);
                }
            }
            else {
                System.out.println("Invalid Choice");
                return;
            }

            if (rumus != null) {
                double converTemperature = rumus.convert(temperature);
                System.out.print("Converted the temperature : " + converTemperature);
            }
        }
        
        
    }
}

abstract class converTemperature {
    abstract double convert(double temperature);
}

class celciustofahrenheit extends converTemperature {
    public double convert(double temperature) {
        return (temperature * 9 / 5) + 32;
    }
 }

class celciustokelvin extends converTemperature {
    public double convert(double temperature) {
        return temperature + 273.15;
    }
 }

class fahrenheittocelcius extends converTemperature {
    public double convert(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
 }

class fahrenheittokelvin extends converTemperature {
    public double convert(double temperature) {
        return 5 / 9 * (temperature - 32) + 273;
    }
 }

class kelvintocelcius extends converTemperature {
    public double convert(double temperature) {
        return temperature - 273;
    }
 }

class kelvintofahrenheit extends converTemperature {
    public double convert(double temperature) {
        return 9 / 5 * (temperature - 273) + 32;
    }
 }