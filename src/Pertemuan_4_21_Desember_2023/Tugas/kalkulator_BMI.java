package Pertemuan_4_21_Desember_2023.Tugas;
import java.util.Scanner;
import java.text.DecimalFormat;

public class kalkulator_BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Berat Badan Anda (Kg) : ");
        float BB = scan.nextFloat();
        System.out.print("Masukkan Tinggi Badan Anda (Cm) : ");
        float TB = scan.nextFloat();

        float height = TB;
        height /= 100;
        double BMI = BB / (height * height);

        DecimalFormat df = new DecimalFormat("#.#");
        String fBMI = df.format(BMI);

        System.out.println("Body Max Index anda adalah " + fBMI);

        if (BMI < 18.5){
            System.out.println("Berat badan anda kurang");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Berat badan anda normal");
        } else if (BMI >= 25 && BMI <= 29.9){
            System.out.println("Berat badan anda lebih");
        }else {
            System.out.println("Anda masuk dalam kategori Obesitas");
        }

        scan.close();
    }
}
