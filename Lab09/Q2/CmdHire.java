public class CmdHire extends RecordedCommand{
    private Employee hiredemployee;

    @Override
    public void execute(String[] cmdStrings) {
        hiredemployee = new Employee(cmdStrings[1], Integer.parseInt(cmdStrings[2]));
        Company company = Company.getInstance();
        company.createEmployee(hiredemployee.getName(), hiredemployee.getAnnualLeaves());

        clearRedoList();
        addRedoCommand(this);
    }

    @Override
    public void undoMe(){
        
    }
    // public abstract void redoMe();
}