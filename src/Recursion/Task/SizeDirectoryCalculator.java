package Recursion.Task;
import java.io.File;
import java.util.Scanner;

public class SizeDirectoryCalculator {
    private static Scanner scan;
    public static long CalculatorDirectorySize(File directory) {
        long size = 0;

        // List all files & subdirections
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // if file, add its soze to total size
                    size += file.length();
                } else if (file.isDirectory()) {
                    // if directory, recursively calculate it's size
                    size += CalculatorDirectorySize(file);
                }
            }
        }
        return size;
    }

    public static void main(String[] args) {
        // prompt user to input directory path
        String directoryPath = "D:/OPPO";

        scan = new Scanner(System.in);

        // calculate directory size recursively
        long totalsize = CalculatorDirectorySize(new File(directoryPath));

        System.out.println("==================");
        System.out.println("Choose which size you would to convert");
        System.out.println("1) byte");
        System.out.println("2) kilobyte");
        System.out.println("3) megabyte");
        System.out.println("4) gigabyte");
        System.out.println("5) terabyte");
        System.out.println("==================");
        System.out.print("Your choice : ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Total size of directory is : "+totalsize+" B");
                break;
            case 2:
                long totalsizeKB = totalsize / 1024;
                System.out.println("Total size of directory is : "+totalsizeKB+" KB");
                break;
            case 3:
                long totalsizeMB = totalsize / 1024 / 1024;
                System.out.println("Total size of directory is : "+totalsizeMB+" MB");
                break;
            case 4:
                long totalsizeGB = totalsize / 1024 / 1024 / 1024;
                System.out.println("Total size of directory is : "+totalsizeGB+" GB");
                break;
            case 5:
                long totalsizeTB = totalsize / 1024 / 1024 / 1024 / 1024;
                System.out.println("Total size of directory is : "+totalsizeTB+" TB");
                break;
            default:
                System.out.println("error input");
                System.exit(choice);
        }
    }
}
