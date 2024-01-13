package FlowControl_IfElse;
import java.util.Scanner;
public class IfElse2 {
    
        public static void main(String[] args) {
            // to find out the odd or even number
              Scanner scan = new Scanner(System.in);
                while (true){
                    System.out.print("Enter a number : ");
                    int num = scan.nextInt();
                    
                    if (num == 0) {
                        System.out.println("The Program is over");
                        break;
                    }

                    if (num % 2 == 0){
                        System.out.println("The number is EVEN ");
                    } 
                    
                    else {
                        System.out.println("The number is ODD ");
                    }
                    
                }
            scan.close();
          }

}
