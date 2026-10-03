

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException 
	{

		//Start up the system
		Scanner in = new Scanner(System.in); 

		System.out.print("Please enter the filename: ");
		String filepathname = in.next(); 
				
		_______________________ allEmployees; //Set up an arraylist variable: ArrayList<Employee>  
		allEmployees = ____________________; //Call this method to get file data into the array list: Employee.createEmployeeListFromFile(filepathname);
		
		System.out.println("\nTotal count: " + ____________________ + " records."); //Show the total count: allEmployees.size()

		for (int i=0;_________________________________) //Loop through the records based on allEmployees.size()
		{
			Employee e;
			e = allEmployees.__________________;//Get an entry from the array list: allEmployees.get(i);			
			System.out.println(________________________); //Show the record contents as a string: e.toStringSalaryDetails()
		}

		in.close();
	}
}
