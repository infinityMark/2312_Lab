public class CmdHire extends RecordedCommand{
    private Employee hiredemployee;

    @Override
    public void execute(String[] cmdStrings) {
        hiredemployee = new Employee(cmdStrings[1], Integer.parseInt(cmdStrings[2]));
        Company company = Company.getInstance();
        company.createEmployee(hiredemployee.getName(), hiredemployee.getAnnualLeaves());

        clearRedoList();
        addUndoCommand(this);
        // System.out.println(this.hiredemployee);
        System.out.println("Done.");
    }

    @Override
    public void undoMe(){
        Company company = Company.getInstance();
        company.fireEmployee(this.hiredemployee.getName());
        addRedoCommand(this);
    }
    
    @Override
    public void redoMe(){
        Company company = Company.getInstance();
        company.createEmployee(hiredemployee.getName(), hiredemployee.getAnnualLeaves());
        addUndoCommand(this);
    }
}