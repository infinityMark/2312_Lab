// package Q1;

public class ListAllRecords implements Command{
    @Override 
    public void execute(String[] cmdStrings) {
        Company.getInstance().listEmployees();
    }
}