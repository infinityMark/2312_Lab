public class Manager extends Employee
{
	//added field: Other than the basic salary in the Employee superclass, a manager has a bonus
	________________bonus; //private double bonus;

	//Constructor
	public Manager(____, ____, ____, ____) //There should be 4 parameters now: String aId, String aName, double aSalary, double aBonus
	{
		____________________; //call the constructor of the superclass, Employee: super(aId, aName, aSalary); 
		bonus = ____________; //Set the bonus field: aBonus
	}

	//Return a string representation for salary details
	public String toStringSalaryDetails() 
	{ 
		return String.format("[%s %s] Basic salary: %.2f, Bonus: %.2f", 
				_____________, //super.getId(), 
				_____________, //super.getName(), 
				_____________, //super.getSalary(), 
				_____________); //bonus
	}

	//Accessor method - redefine the .getSalary method of the superclass, Employee
	public double getSalary() 
	{
		return ______________ + bonus; //Basic salary: super.getSalary()
	}
}

