package Pertemuan_2_10_Desember_2023;

import java.util.Scanner; // digunakan setiap kali menginput sesuatu
import java.util.Random;

public class tebak_angka {
    public static void main(String[] args){
        Random acak = new Random();           // Random (memanggil library), acak (nama variabel), 
                                                // new (membuat instansi objek baru dari suatu kelas, sehingga memungkinkan Anda untuk menggunakan fungsionalitas yang didefinisikan dalam kelas tersebut.)

        int number = acak.nextInt(99) + 1;  // nextInt bagian dari kelas Random yang digunakan untuk menghasilkan bilangan bulat secara acak

        Scanner scan = new Scanner(System.in);
        int guess; // bss ad block started by symbol

        // looping
        while(true) {
            System.out.println("Enter a number from 1 to 99");
            guess = scan.nextInt();

            if (guess < number) {
                System.out.println("Guess is Low");
            } else if (guess > number) {
                System.out.println("Guess is High");
            } else {
                System.out.println("Conrats, you guessed it");
                break;
            }
        scan.close();
        }
    }
    
}