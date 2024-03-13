package OOP.Inheritence;
import java.util.Scanner;

class EmployOffice {
    int empNo;
    String empName;
    int salary;
    String designation;

    // Konstruktor
    public EmployOffice(int empNo, String empName, int salary, String designation) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
        this.designation = designation;
    }

    // Metode untuk menampilkan data
    void displaydata() {
        System.out.println("Employ name => "+empName +"\t\tEmploy Number => "+empNo);
        System.out.println("Salary => "+salary+"\t\tDesignation => "+designation);
    }
}

class Teaching extends EmployOffice {
    // Konstruktor
    public Teaching(int empNo, String empName, int salary, String designation) {
        super(empNo, empName, salary, designation);
    }
}

class NonTeaching extends EmployOffice {
    // Konstruktor
    public NonTeaching(int empNo, String empName, int salary, String designation) {
        super(empNo, empName, salary, designation);
    }
}

public class main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.println("Data about Teaching class => \n");
        System.out.print("Enter Employ number => ");
        int empNoTeaching = scan.nextInt();
        System.out.print("Enter Employ name => ");
        String empNameTeaching = scan.next();
        System.out.println("Enter salary => ");
        int salaryTeaching = scan.nextInt();
        System.out.println("Enter designation => ");
        String designationTeaching = scan.next();

        Teaching t1 = new Teaching(empNoTeaching, empNameTeaching, salaryTeaching, designationTeaching);
        t1.displaydata();

        System.out.println("Data about Non Teaching class => \n");
        System.out.print("Enter Employ number => ");
        int empNononTeaching = scan.nextInt();
        System.out.print("Enter Employ name => ");
        String empNamenonTeaching = scan.next();
        System.out.println("Enter salary => ");
        int salarynonTeaching = scan.nextInt();
        System.out.println("Enter designation => ");
        String designationnonTeaching = scan.next();

        NonTeaching nt1 = new NonTeaching(empNononTeaching, empNamenonTeaching, salarynonTeaching, designationnonTeaching);
        nt1.displaydata();
    }
}