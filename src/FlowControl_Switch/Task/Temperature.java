package FlowControl_Switch.Task;
import java.util.Scanner;

public class Temperature {
  public static void main(String[] args) {
    float first, result;
    int choice, choice2;


    try (Scanner scan = new Scanner(System.in)) {
      while (true) {
        System.out.println("===================");
        System.out.println("Selamat datang di pengukuran suhu");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin\n");
        System.out.print("Pilih salah satu satuan suhu awal (1-3):");
        choice = scan.nextInt();

        // switch (choice) {
        //   default:
        //     System.out.println("Invalid choice");
        //     System.exit(choice);;
        // }

        System.out.print("Enter the temperature : ");
        first = scan.nextFloat();
        
        System.out.println("vvvvvvvvvvvvvvvvv");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin\n");
        System.out.print("Pilih satuan suhu yg diinginkan (1-3):  :");
        choice2 = scan.nextInt();

        switch (choice2) {
          case 1:
            if (choice == 1) {
              result = (first);
              System.out.println("Hasil konversi dari "+ first+"°C ke Celcius adalah tetap : "+result+"°C");
              break;
            } 
            else if (choice == 2) {
              result = ((first - 32) * 5 / 9);
              System.out.println("Hasil konversi dari "+ first+"°F ke Celcius adalah  : "+ result+ "°C");
              break;
            }
            else if (choice == 3) {
              result = (first - 273.15f);
              System.out.println("Hasil konversi dari "+ first+"°K ke Celcius adalah  : "+ result+ "°C");
              break;
            }
          case 2:
            if (choice == 1) {
              result = (first * 9 / 5 + 32);
              System.out.println("Hasil konversi dari "+ first+"°C ke Fahrenheit adalah : "+result+"°F");
              break;
            } 
            else if (choice == 2) {
              result = (first);
              System.out.println("Hasil konversi dari "+ first+"°F ke Fahrenheit adalah tetap : "+result+"°F");
              break;
            }
            else if (choice == 3) {
              result = ((first - 273.15f)* 9 / 5 + 32);
              System.out.println("Hasil konversi dari "+ first+"°K ke Fahrenheit adalah : "+result+"°F");
              break;
            }
          case 3:
            if (choice == 1) {
              result = (first + 273.15f);
              System.out.println("Hasil konversi dari "+ first+"°C ke Fahrenheit adalah : "+result+"°F");
              break;
            } 
            else if (choice == 2) {
              result = (first);
              System.out.println("Hasil konversi dari "+ first+"°F ke Fahrenheit adalah tetap : "+result+"°F");
              break;
            }
            else if (choice == 3) {
              result = (((first - 32)* 5 / 9) + 273.15f);
              System.out.println("Hasil konversi dari "+ first+"°K ke Fahrenheit adalah : "+result+"°F");
              break;
            }
          default:
            System.out.println("Anda memasukkan angka diluar opsi ");
            break;        
        }

      }
    }
  }
}
