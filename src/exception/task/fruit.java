package exception.task;
import java.util.ArrayList;
import java.util.Scanner;

public class fruit {
    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Inventaris inv = new Inventaris();

        boolean addMore = true;
        while (addMore) {
            System.out.println("Enter fruit name:");
            String fruitName = scan.nextLine();
            System.out.println("Enter quantity:");
            int quantity = scan.nextInt();
            scan.nextLine(); // Consume newline left-over
            Buah fruit = new Buah(fruitName, quantity);

            try {
                inv.tambahBuah(fruit);
            } catch (IllegalArgumentException e) {
                System.out.println("Failed to add fruit to the list: " + e.getMessage());
            }

            System.out.println("Do you want to add more fruits? (yes/no)");
            String response = scan.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                addMore = false;
            }
        }

        inv.cetakListBuah();
    }
}

class Buah {
    private String name;
    private int quantity;

    public Buah(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Inventaris {
    private ArrayList<Buah> daftarBuah;

    public Inventaris() {
        daftarBuah = new ArrayList<>();
    }

    public void tambahBuah(Buah fruit) throws IllegalArgumentException {
        for (Buah b : daftarBuah) {
            if (b.getName().equals(fruit.getName())) {
                throw new IllegalArgumentException("The fruit already exists in the inventory.");
            }
        }
        daftarBuah.add(fruit);
    }

    public void cetakListBuah() {
        try {
            System.out.println("List of Fruits:");
            for (Buah fruit : daftarBuah) {
                System.out.println("Fruit Name: " + fruit.getName() + ", Quantity: " + fruit.getQuantity());
            }
        } catch (Exception e) {
            System.out.println("Failed to display the list of fruits: " + e.getMessage());
        }
    }
}
