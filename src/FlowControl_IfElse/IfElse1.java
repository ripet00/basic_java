package FlowControl_IfElse;
import java.util.Scanner;

public class IfElse1 {
    // Flow control is a way to tell the program which is 
    
    public static void main(String[] args) {
      // this project is to find out the largest number using if else
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan bilangan ke -1 : ");
        int a = scan.nextInt();
        
        System.out.println("Masukkan bilangan ke -2 : ");
        int b = scan.nextInt();

        System.out.println("Masukkan bilangan ke -3 : ");
        int c = scan.nextInt();

        System.out.println("Masukkan bilangan ke -4 : ");
        int d = scan.nextInt();

        System.out.println("Masukkan bilangan ke -5 : ");
        int e = scan.nextInt();

        if ((a > b) && (a > c) && (a > d) && (a > e)){
            System.out.println("The largest number is " + a);
        } 
        else if ((b > a) && (b > c) && (b > d) && (b > e)){
            System.out.println("The greatest number is " + b);
        } 
        else if ((c > a) && (c > b) && (c > d) && (c > e)) {
            System.out.println("The largest number is " + c);
        } 
        else if ((d > a) && (d > b) && (d > c) && (d > e)){
            System.out.println("The largest number is " + d);
        }   
        else {
            System.out.println("The largest number is " + e);
        }

        scan.close();
    }
}
