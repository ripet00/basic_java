package Pertemuan_5_24_Desember_2023;
import java.util.Scanner;

// Class for defining profile of the students
class MyProfile {
    // Class atribute / properties, so there are attribute of students profile
    int id;
    String name;
    String nick_name;
    int age;
}

// Marksheet class declaration and definition
class MyMarkSheet {
    double math;
    double science;
    double english;
}

public class object_classes {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)){

            // Create profile1 is the object of class MyProfile
            MyProfile profile1 = new MyProfile();
            System.out.println("Enter Profile ID : ");
            profile1.id = read.nextInt();
            System.out.println("Enter Your Name : ");
            profile1.name = read.next();
            System.out.println("Enter Your Nick Name : ");
            profile1.nick_name = read.next();
            System.out.println("Enter Your Age : ");
            profile1.age = read.nextInt();      

            System.out.println("Profile Created successfullly ");
            System.out.println("Profile ID : "+ profile1.id);
            System.out.println("Student Name : " + profile1.name);
            System.out.println("Assigned Nickname : " + profile1.nick_name);
            System.out.println("Student Age : " + profile1.age);

            // Marksheet1 is object of class MyMarkSheet
            MyMarkSheet MarkSheet1 = new MyMarkSheet();

            System.out.println("Enter marks in Math (Out of 100) : ");
            // Taking input  in class parameters through object
            MarkSheet1.math = read.nextInt();
            System.out.println("Enter marks in Science (Out of 100) : ");
            MarkSheet1.science = read.nextInt();
            System.out.println("Enter marks in English (Out of 100) : ");  
            MarkSheet1.english = read.nextInt();

            // Calculating sum of marks of all subjects
            double TotalScore = MarkSheet1.math + MarkSheet1.english + MarkSheet1.science;

            // Calculating the percentage of the score
            double percentage = TotalScore / 3;

            System.out.println("The Percentage : ");
            System.out.println("Percentage : " + percentage);
      
        }          
    }
}
