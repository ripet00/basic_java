package OOP.Abstract;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {

}

// Kelas abstrak mewakili item dalam perpustakaan
abstract class LibraryItem {
    protected String title;
    protected String author;

    // Konstruktor
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Metode abstrak unntuk menampilkan informasi item
    abstract void displayInfo();
}

// Kelas turunan untuk buku
class Book extends LibraryItem {
    private int pages;

    // Konstruktor
    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    // Implementasi metode untuk menampilkan informasi buku
    void displayInfo() {
        System.out.println("Book Title : "+ title);
        System.out.println("Author : "+author);
        System.out.println("Number of pages : "+pages);
    }
}

// Kelas turunan untuk majalah
class Magazine extends LibraryItem {
    private String issue;

    // Konstruktor
    public Magazine(String title, String author, String issue) {
        super(title, author);
        this.issue = issue;
    }

    // Implementasi metode untuk menampilkan informasi buku
    void displayInfo() {
        System.out.println("Book Title : "+ title);
        System.out.println("Author : "+author);
        System.out.println("Number of pages : "+issue);
    }
}

// Kelas untuk mengelola perpustakaan
class LibraryManager {
    private List<LibraryItems> items;

    //Konstruktr
    public LibraryManager() {
        items = new ArrayList<>();
    }
}


public class LibraryManagementSystem {
    private
}