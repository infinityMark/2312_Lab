public class exchangeSalaries extends RecordedCommand //<=== note the change
{
	//When addSalary is invoked, an object of the AddSalary class will be 
	// added to the undo list (and may also be stored in the redo list later)
	//We add instance fields in the objects to store the data which will be needed upon undo/redo
	private Employee firstEmployee;
	private Employee secondEmployee;
	
	@Override
	public void execute(String[] cmdParts)
	{
		//Note: In Q1, e and addAmount were local variables.  But now they are the data in the object (instance fields).
		Company company = Company.getInstance();
		firstEmployee = company.findEmployee(cmdParts[1]);
		secondEmployee = company.findEmployee(cmdParts[2]);

        Employee.exchangeSalaries(firstEmployee, secondEmployee);

		addUndoCommand(this); //<====== store this command (addUndoCommand is implemented in RecordedCommand.java)
		clearRedoList(); //<====== There maybe some commands stored in the redo list.  Clear them.

		System.out.println("Done.");
	}
	
	@Override
	public void undoMe()
	{
        Employee.exchangeSalaries(secondEmployee, firstEmployee);
		addRedoCommand(this); //<====== upon undo, we should keep a copy in the redo list (addRedoCommand is implemented in RecordedCommand.java)
	}
	
	@Override
	public void redoMe()
	{
		Employee.exchangeSalaries(firstEmployee, secondEmployee);
		addUndoCommand(this); //<====== upon redo, we should keep a copy in the undo list
	}
}
