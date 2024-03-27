package exception;
import java.util.ArrayList;

public class first {
    public static void main(String[] args) {
        Inventaris inventaris = new Inventaris();

        try {
            inventaris.tambahBarang(new Barang("Buku",10));
            inventaris.tambahBarang(new Barang("Pensil",20));
            inventaris.tambahBarang(new Barang("Buku",5));      // penambahan barang yg sudah ada
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal menambahkan barang : "+e.getMessage());
        }
        inventaris.cetakDaftarBarang();

        try {
            inventaris.hapusBarang("Pensil");
            inventaris.hapusBarang("Penghapus"); // Penghapusan barang yang tidak ditemukan
        } catch (IllegalArgumentException e) {
            System.out.println("Faile to erase the stuff : "+e.getMessage());
        }
        inventaris.cetakDaftarBarang();
    }
}

class Barang {
    private String nama;
    private int jumlah;

    public Barang(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumah() {
        return jumlah;
    }
}

class Inventaris {
    private ArrayList<Barang>daftarBarang;

    public Inventaris() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang ) throws IllegalArgumentException {
        for(Barang b : daftarBarang) {
            if (b.getNama().equals(barang.getNama())) {
                throw new IllegalArgumentException("The stuff already exist in the inventory : ");
            }
        }
        daftarBarang.add(barang);
    }

    public void hapusBarang(String namaBarang) throws IllegalArgumentException {
        boolean found = false;
        for(Barang barang : daftarBarang) {
            if (barang.getNama().equals(namaBarang)) {
                daftarBarang.remove(barang);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("We couldn't found the stuff");
        }
    }

    public void cetakDaftarBarang() {
        try{
            for(Barang barang : daftarBarang) {
                System.out.println("Nama : " + barang.getNama() + ",jumlah : "+barang.getJumah());
            }
        }   catch (Exception e) {
            System.out.println("Gagal mencetak daftar barang : " + e.getMessage());
        }
    }
}