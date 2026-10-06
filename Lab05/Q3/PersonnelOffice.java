import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class PersonnelOffice
{
    ArrayList<Employee> allEmployees; 
    
    public int getTotal() 
    {
		  return allEmployees.size(); 
    }
    
    public void report()
    {
        double totalSalary = 0;
		for (int i=0; i < allEmployees.size(); i++) {
            System.out.println(allEmployees.get(i).toStringSalaryDetails()); 
            totalSalary+=allEmployees.get(i).getSalary();
        }
        System.out.println("==============================");
        System.out.println(String.format("Total salary expense: %.2f", totalSalary));
    }
    
    public PersonnelOffice()
    {
        allEmployees = new ArrayList<Employee>();
    }

    public void loadEmployeeData(String filepathname) throws FileNotFoundException 
    {
        allEmployees.clear(); 

        Scanner inFile = new Scanner(new File(filepathname));

        while (inFile.hasNext())
        {
            String id=inFile.next(); 
            
            if (id.charAt(0)=='9') 
            {
                String name=inFile.next(); 
                double salary = inFile.nextDouble();
                double bonus = inFile.nextDouble();
                Manager m = new Manager(id, name, salary, bonus); 
                allEmployees.add(m); 
            }
                else
            {
                String name=inFile.next();
                double salary = inFile.nextDouble();
                Employee e = new Employee(id, name, salary);
                allEmployees.add(e);
            }
        }

        inFile.close();
    }
}