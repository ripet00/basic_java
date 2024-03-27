package OOP.Encapsulation.task;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class employeeMS_input {
    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);

        employee_manager em = new employee_manager();

        boolean addmoredata = true;

        while (addmoredata) {
            System.out.println("Enter your name : ");
            String name = scan.nextLine();
            System.out.println("Enter salary : ");
            int gaji = scan.nextInt();
            System.out.println("Enter the Employee ID : ");
            int id = scan.nextInt();
            scan.nextLine();
            employee employer = new employee(name, gaji, id);
            em.addemployee(employer);

            // to add more data
            System.out.println("Do you want to add more data (yes / no) : ");
            String choice = scan.nextLine();
            addmoredata = choice.equalsIgnoreCase("yes");
        }
        System.out.println("----------------");
        System.out.println("Display all the employee information");
        em.displayAll();
        
    }
}

class employee {
    private String name;
    private double salary;
    private int employeeId;

    // Konstruktor
    public employee(String name, double salary, int employeeId) {
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    // Metode untuk mengambil nama pegawai
    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Metode mengambil gaji pegawai
    public double getSalary() {
        return salary;
    }

    // Metode untuk mengatur gaji pegawai
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Metode mengambil ID pegawai
    public int getEmployeeId() {
        return employeeId;
    }

    // Metode menampilkan informasi pegawai
    public void displayInfo() {
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Name : "+ name);
        System.out.println("Salary : Rp. "+salary);
    }
}

class employee_manager {
    private List<employee> karyawan;

    // Konstruktor
    public employee_manager() {
        karyawan = new ArrayList<>();
    }
    
    // method add employee
    public void addemployee(employee tambahkaryawan) {
        karyawan.add(tambahkaryawan);
    }

    public void displayAll() {
        System.out.println("Employee Information");
        for (employee tambahkaryawan : karyawan) {
            tambahkaryawan.displayInfo();
            System.out.println();
        }
    }
}
