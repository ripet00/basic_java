package Arrays;
import java.util.Scanner;

public class Array_Operators {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int size, choice;

        while(true) {
            System.out.println("\nArrays Operator\n");
            System.out.println("1. One dimensional array");
            System.out.println("2. Two dimensional array");
            System.out.println("3. Record saving array operation");
            System.out.println("4. Exit the program");
            System.out.print("\nEnter the choice : ");
            choice = scan.nextInt();

            switch(choice) {
                case 1:
                    int num1[] = new int[5];
                    // declaration & instantiation
                    num1[0] = 10;
                    num1[1] = 20;
                    num1[2] = 30;
                    num1[3] = 40;
                    num1[4] = 50;


                    for (int i = 0; i < num1.length; i++) {
                        System.out.print(num1[i] + " ");
                    }

                    break;
                
                case 2:
                    int num2[][] = {{15, 12, 4}, {13, 5, 32}, {43, 20, 6}, {10, 20, 30}};

                    for (int i = 0; i < 3 ; i++) {
                        for(int j = 0; j < 3; j++) {
                            System.out.print(num2[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                
                case 3:
                    System.out.println("Enter the number to record to save : ");
                    size = scan.nextInt();
                    String[] names = new String[10];
                    int[] ages = new int[10];

                    for (int i = 0; i < size; i++) {
                        System.out.println("Enter record number : " + (i + 1));
                        System.out.println("Enter user name : ");
                        names[i] = scan.next();
                        System.out.println("Enter user age : ");
                        ages[i] = scan.nextInt();
                    }
                    System.out.println("\n"+"Name"+"\t\t" +"Age");
                    System.out.println("__________________");
                    int i = 0;
                    while (i < size) {
                        System.out.println(names[i] + "\t\t"+ ages[i]);
                        i++;
                    }
                case 4:
                System.exit(0);

                default:
                System.out.println("Invalid choice \n\n make valid choice");
                    break;
                
                
                
            }
        }
    }
}

