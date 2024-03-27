package exception.task;
import java.util.ArrayList;
import java.util.Scanner;

public class fruit_list {
    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        inventaris inv = new inventaris();

        System.out.println("Enter fruit name :");
            String namabuah = scan.nextLine();
            System.out.println("Jumlah buah : ");
            int jumlahbuah = scan.nextInt();
            scan.nextLine();
            buah buah_buahan = new buah(namabuah, jumlahbuah);

        try {
            inv.tambahbuah(buah_buahan);
            
        }catch (IllegalArgumentException e) {
            System.out.println("Gagal menambahkan list buah : "+e.getMessage());
        }

        inv.cetaklistBuah();

        finally {
            System.out.println("============");
            System.out.println("Nama-nama buah :"+namabuah);
        }
    }
}

class buah {
    private String nama;
    private int jumlah;

    public buah(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getname() {
        return nama;
    }

    public int getsum() {
        return jumlah;
    }
}

class inventaris {
    private ArrayList<buah>daftarbuah;

    public inventaris() {
        daftarbuah = new ArrayList<>();
    }

    public void tambahbuah(buah fruit ) throws IllegalArgumentException {
        for(buah b : daftarbuah) {
            if (b.getname().equals(fruit.getname())) {
                throw new IllegalArgumentException("The stuff already exist in the inventory : ");
            }
        }
        daftarbuah.add(fruit);
    }

    public void hapusbuah(String namabuah) throws IllegalArgumentException {
        boolean found = false;
        for(buah fruit : daftarbuah) {
            if (fruit.getname().equals(namabuah)) {
                daftarbuah.remove(fruit);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("We couldn't found the stuff");
        }
    }

    public void cetaklistBuah() {
        try{
            for(buah fruit : daftarbuah) {
                System.out.println("Nama buah : " + fruit.getname() + ",jumlah : "+fruit.getsum());
            }
        }   catch (Exception e) {
            System.out.println("Gagal menampilkan daftar buah : " + e.getMessage());
        }
    }
}