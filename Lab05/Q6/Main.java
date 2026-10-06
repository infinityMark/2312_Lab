import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Read input file pathname
        Scanner in = new Scanner(System.in); 
        System.out.print("Please enter the filename: ");
        String filepathname = in.next();

        // Grab the StatisticsSystem ss and add counters 
        StatisticsSystem ss = StatisticsSystem.getInstance();  
        
        ss.addCounter(new Counter());

        // Clear the leftover newline character from in.next()
        in.nextLine(); 
        
        System.out.print("Enter the area names (e.g. TaiPo YuenLong WongTaiSin KwunTong): ");
        String line = in.nextLine(); 
        
        Scanner scannerLine = new Scanner(line); 
        while (scannerLine.hasNext()) {
            ss.addCounter(new AreaCounter(scannerLine.next())); 
        }
        scannerLine.close();

        int upperAge, lowerAge;

        System.out.println();

        do {
            System.out.print("\nEnter the age groups ('-1 -1' to end): ");
            lowerAge = in.nextInt();
            upperAge = in.nextInt();
            if (upperAge!=-1 && lowerAge!=-1)
                ss.addCounter(new AgeGroupCounter(upperAge, lowerAge));
        } while (upperAge!=-1 && lowerAge!=-1);

        // The ss will load file data and tell its counters to count 
        ss.countData(filepathname);    
        
        // The ss will tell its counters to report
        ss.report();
        
        in.close();
    }
}