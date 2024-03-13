package OOP.Encapsulation;

public class Employeemanagementsystem {
    public static void main(String[] args) {
        // Membuat objek pegawai
        employee employee1 = new employee("Bros",1000000, 101);

        // Menampilkan informasi pegawai
        System.out.println("Employee Information : ");
        employee1.displayInfo();

        // Mengubah gaji pegawai
        employee1.setSalary(2000000);

        // Menampilkan informasi pegawai setelah perubahan gaji
        System.out.println("\nUpdated employee information : ");
        employee1.displayInfo();
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