import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Employee
{
	private String id;
	private String name;
	private double salary;

	//Constructor
	public Employee(String aId, String aName, double aSalary)
	{
		_____________________________
		_____________________________
		_____________________________
	}

	//Accessor methods
	public String getId()	{_____________________________}
	public String getName()	{_____________________________}
	public double getSalary()	{_____________________________}

	//Return a string representation for salary details
	public String toStringSalaryDetails() 
	{ 
		return _____________________________; //Compose the string: String.format("[%s %s] Salary: %.2f", id, ____, ____);
	}
	
	//Raise the salary by a given percentage (will be used later)
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	//Read employee data from the given file, return an arraylist of employees
	public static ArrayList<Employee> createEmployeeListFromFile(String filepathname) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new File(filepathname));

		_________________arraylist_Staff; // Set up an arraylist variable: ArrayList<Employee> arraylist_Staff;
		
		arraylist_Staff = _________________; //Create the array list: new ArrayList<Employee>()

		while (______________________) //As long as the file still has contents: inFile.hasNext()
		{
			String id=______________________;//inFile.next();
			String name=______________________;//inFile.next();
			double salary = ______________________;//(Please figure out by yourself)
			
			Employee e; 
			e = new Employee(________________________);
			______________________;//Add e to the arraylist: arraylist_Staff.add(e);
		}

		inFile.close();
		return ____________; //Return the arraylist: return arraylist_Staff;
	}
}
