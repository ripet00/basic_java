package OOP.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas abstrak untuk mewakili anggota sekolah 
abstract class SchoolMember {
    // protected is access modifier
    protected String name;

    public SchoolMember(String name) {
        this.name = name;
    }
    
    abstract void displayInfo();
}
    // Kelas turunan siswa
    class Student extends SchoolMember {
        private int grade;

        // Konstruktor
        public Student(String name, int grade) {
            super(name);
            this.grade = grade;
        }

        // Implementasi menampilkan informasi siswa
        void displayInfo() {
            System.out.println("Student Name : "+name);
            System.out.println("Grade : "+grade);
        }
    }

    // Kelas turunan guru
    class Teacher extends SchoolMember {
        private String subject;

        // Konstruktor
        public Teacher(String name, String subject) {
            super(name);
            this.subject = subject;
        }

        // Implementasi menampilan informasi guru
        void displayInfo() {
            System.out.println("Student Name : "+name);
            System.out.println("Subect : "+subject);
        }
    }


class SchoolManager {
    private List<SchoolMember> members;

    //Konstruktor
    public SchoolManager() {
        members = new ArrayList<>();
    }

    // Metode  untuk menambahkan anggota sekolah
    public void addMember(SchoolMember member) {
        members.add(member);
    }

    // Metode untuk menampilkan semua anggota sekolah
    public void displayAllMembers() {
        System.out.println("School Members : ");
        for(SchoolMember member : members) {
            member.displayInfo();
            System.out.println();;
        }
    }
}

public class School_Management_System {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SchoolManager school = new SchoolManager();

        // Menambahkan contoh anggota sekolah
        school.addMember(new Student("John",10));
        school.addMember(new Teacher("Leon","Mathematics"));

        // Menampilkan menu
        System.out.println("Welcome to school management system");
        System.out.println("1. Display all members");
        System.out.println("2. Exit");
        System.out.print("Enter your choice : ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                school.displayAllMembers();
                break;
            case 2:
                System.out.println("Exit the program");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
        scan.close();
    }
}
