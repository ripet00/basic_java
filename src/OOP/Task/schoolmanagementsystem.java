package OOP.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract class to represent school members
abstract class SchoolMember {
    private String name;

    public SchoolMember(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    abstract void displayInfo();
}

// Subclass for students
class Student extends SchoolMember {
    private int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    // Implementation to display student information
    void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Grade: " + grade);
    }
}

// Subclass for teachers
class Teacher extends SchoolMember {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    // Implementation to display teacher information
    void displayInfo() {
        System.out.println("Teacher Name: " + getName());
        System.out.println("Subject: " + subject);
    }
}

class SchoolManager {
    private List<SchoolMember> members;

    public SchoolManager() {
        members = new ArrayList<>();
    }

    // Method to add a member to the school
    public void addMember(SchoolMember member) {
        members.add(member);
    }

    // Method to display information for all members
    public void displayAllMembers() {
        System.out.println("School Members:");
        for (SchoolMember member : members) {
            member.displayInfo();
            System.out.println("--------------------");
        }
    }
}

public class schoolmanagementsystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SchoolManager school = new SchoolManager();

        // Adding sample school members
        school.addMember(new Student("John", 10));
        school.addMember(new Teacher("Jane", "Mathematics"));

        // Displaying menu
        System.out.println("Welcome to the school management system");
        System.out.println("1. Display all members");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                school.displayAllMembers();
                break;
            case 2:
                System.out.println("Thank you for using the school management system");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
