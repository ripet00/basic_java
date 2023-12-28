package Pertemuan_3_17_Desember_2023.tugas;
import java.util.Scanner;

public class not {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan boolean X : ");
        String input1 = scan.nextLine();
        System.out.print("Masukkan boolean Y : ");
        String input2 = scan.nextLine();

        boolean x = Boolean.parseBoolean(input1);
        boolean y = Boolean.parseBoolean(input2);

        // boolean x = true;
        // boolean y = false;

        boolean a , b , c , d , e;

        // NOT
        a = !x;
        b = !y;
        c = x || y;
        d = x ^ y;
        e = x && y;

        System.out.println("NOT \n" + "X = " + a + "\nY = " + b);
        System.out.println("OR \nc = " + c);
        System.out.println("XOR \nd = " + d);
        System.out.println("AND \ne = " + e);

        scan.close();
    }
}
