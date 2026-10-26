// package Q1;

public class AddSalary implements Command{
    @Override 
    public void execute(String[] cmdStrings) {
        Employee target = Company.getInstance().findEmployee(cmdStrings[1]);
        target.addSalary(Integer.parseInt(cmdStrings[2]));
        System.out.println("Done.");
    }
}