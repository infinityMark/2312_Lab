// package Q1;

public class Employee{
    private String name;
    private int salary;
    private int annualLeaves;

    public Employee(String n, int s, int al) {
        name=n; salary=s; annualLeaves=al;
    }

    public String getName() {return name;}

    public int getAnnualLeaves() {return annualLeaves;}
    
    public void addSalary(int inc) {salary+=inc;}

    public void setSalaray(int salary) {this.salary = salary;}

    public static void exchangeSalaries(Employee firstEmployee, Employee secondEmployee) {
        int temp = firstEmployee.salary;
        firstEmployee.setSalaray(secondEmployee.salary);
        secondEmployee.setSalaray(temp);
    }

    public void setAnnualLeaves(int al) {annualLeaves=al;}

    @Override
    public String toString() {
        return name + " ($"+salary+", "+annualLeaves+" days)";
    }
}