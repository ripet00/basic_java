package FlowControl_ForLooping_DoWhile;
import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        // Create multiplication table using do while
        Scanner scan = new Scanner(System.in);
        int num, count = 1;
        int limit;

        System.out.print("Enter the value to find the multiplication table : ");
        num = scan.nextInt();

        System.out.print("Enter the max limit for multiplication table : ");
        limit = scan.nextInt();

        do {
            System.out.println(num + " x " + count + " = " + (num * count));
            count++;
        } while (count <= limit);

        scan.close();
    }
}
 // windows desktop using x86 arsitechture (intel & amd), mac using ARM
 