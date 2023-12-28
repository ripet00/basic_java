package Pertemuan_3_17_Desember_2023.tugas;
import java.util.Scanner;

public class increament_decrement {
    public static void main(String args[]) {
    
        System.out.print("Masukkan Bilangan x : ");
        Scanner bil = new Scanner(System.in);
        int x = bil.nextInt();
        int r = x, s = x, t = x, u = x;

        int a, b, c, d;
        a = r++;
        b = ++s;
        c = t--;
        d = --u;

        System.out.println("Post Increment (x++) : \na = " + a + "\nx = " + r + "\n");
        System.out.println("Pre Increment (++x) : \nb = " + b + "\nx = " + s + "\n");
        System.out.println("Post Decrement (x--) : \nc = " + c + "\nx = " + t + "\n");
        System.out.println("Pre Decrement (--x) : \nd = " + d + "\nx = " + u + "\n");

        bil.close();
    }
}
