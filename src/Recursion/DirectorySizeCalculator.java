package Recursion;
import java.io.File;

public class DirectorySizeCalculator {
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

        // calculate directory size recursively
        long totalsize = CalculatorDirectorySize(new File(directoryPath));

        // convert bytes to kilobytes (1 KB = 1024 bytes)
        long totalsizeKB = totalsize / 1024;

        // convert kilobytes to megabytes (1 MB = 1024 KB)
        long totalsizeMB = totalsizeKB / 1024;

        // convert megabytes to gigabytes (1 GB = 1024 MB)
        long totalsizeGB = totalsizeMB / 1024;

        // display total size of directory
        System.out.println("Total size of directory is : "+totalsizeKB+" KB");
        System.out.println("Total size of directory is : "+totalsizeMB+" MB");
        System.out.println("Total size of directory is : "+totalsizeGB+" GB");
    }
}
