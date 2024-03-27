package exception;
import java.util.Scanner;

public class chocolate_finnaly {
    private static Scanner scan;

    public static void main(String[] args) {
        // initial chocolate stocks
        int whitechocolate_quantity = 20;
        int darkchocolate_quantity = 30;

        // customer purchase the chocolate
        scan = new Scanner(System.in);

        System.out.println("Enter quantity to purchase white Chocolates : ");
        int whitechocolate_purchase = scan.nextInt();
        System.out.println("Enter quantity to purchase Dark Chocolates : ");
        int darkchocolate_purchase = scan.nextInt();


        // try catch to handle the exception
        try {
            if (whitechocolate_quantity < whitechocolate_purchase && darkchocolate_quantity < darkchocolate_purchase) {
                throw new OutofStockException("White & Dark chocolate out of stock");
            }
            if (whitechocolate_quantity < whitechocolate_purchase) {
                throw new OutofStockException("White Chocolate Out of stock");
            }
            if (darkchocolate_quantity < darkchocolate_purchase) {
                throw new OutofStockException("Dark Chocolate out of stock");
            }
        }
        catch (OutofStockException ex) {
            // Print message passed to the super constructor
            System.err.println(ex.getMessage());
        }

        finally {
            System.out.println("================");
            System.out.println("The stock");
            System.out.println("White chocolates : "+whitechocolate_quantity);
            System.out.println("Dark chocolate : "+darkchocolate_quantity  );
            System.out.println("================");

            System.out.println("================");
            System.out.println("Customer want to buy");
            System.out.println("White chocolate : " + whitechocolate_purchase);
            System.out.println("Dark chocolate : " + darkchocolate_purchase);
            System.out.println("================");

            // calculate the remaining stcok of white chocolate
            if (whitechocolate_quantity >= whitechocolate_purchase) {
                whitechocolate_quantity -= whitechocolate_purchase;
            }

            // calculate the remaining stcok of dark chocolate
            if (darkchocolate_quantity >= darkchocolate_purchase) {
                darkchocolate_quantity -= darkchocolate_purchase;
            }

            System.out.println("================");
            System.out.println("Current stock details");
            System.out.println("White chocolate : "+ whitechocolate_quantity);
            System.out.println("Dark chocolate : "+ darkchocolate_quantity);
            System.out.println("================");

        }
    }
}

class OutofStockException extends Exception {
    //member variable to store our custom message
    String msg;

    OutofStockException(String msg) {
        // passing the parameter to the super class constructor
        super(msg);
    }
}
