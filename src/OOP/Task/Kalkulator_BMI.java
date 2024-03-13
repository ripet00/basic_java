package OOP.Task;
import java.util.Scanner;

public class Kalkulator_BMI {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Enter the height (cm) : ");
        double BB = scan.nextDouble();
        System.out.print("Enter the weight (kg) : ");
        double height = scan.nextDouble();

        calculate hasil = new calculate();

        double BMI =  hasil.BMI(BB, height);

        if (BMI < 18.5){
            System.out.println("Berat badan anda kurang");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Berat badan anda normal");
        } else if (BMI >= 25 && BMI <= 29.9){
            System.out.println("Berat badan anda lebih");
        }else {
            System.out.println("Anda masuk dalam kategori Obesitas");
        }
    }    
}

class calculate {
    public double BMI(double BB, double height) {
        return BB / (height * height);
    }
}
