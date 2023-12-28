package Pertemuan_3_17_Desember_2023;

public class data_type {
    public static void main (String args[]){
        // how to create variables
        // how to declare in java
        // how to initilaze the variable
        int marks; // bss (block started by symbol)

        marks = 95;

        char grade = 'c';
        String result = "excelent";
        float points = 23f;
        double percentage = 95.6 ;
        long haiya = 1000;
        byte bb = 126;

        System.out.println("nilai mu adalah "+ marks +' '+ grade + result + points + percentage + haiya + bb);

        int num1 = 50, num2=20;
        double  a, b, c, d, e;

        a = num1 + num2;
        b = num1 - num2;
        c = num1 * num2;
        d = num1 / num2;
        e = num1 % num2;

        System.out.println("Jumlah = " + a);
        System.out.println("Kurang = " + b);
        System.out.println("Kali = " + c);
        System.out.println("Bagi = " + d);
        System.out.println("Modulo = " + e);
        
    }
}
