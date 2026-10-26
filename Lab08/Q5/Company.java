// package Q1;
import java.util.ArrayList;

public class Company{
    private static final Company instance = new Company();
    private ArrayList<Employee> allEmployees;

    private Company() {
        allEmployees = new ArrayList<>();
    }

    public static Company getInstance() {return instance;}

    public void listEmployees() {
        for (Employee employee : allEmployees)
            System.out.println(employee);
    } //for each employee, apply.toString() and output.

    public void firedEmployee(String name) {
        allEmployees.removeIf(employee -> employee.getName().equals(name));
    }

    public Employee findEmployee(String name) {
        for (Employee employee : allEmployees)
            if (employee.getName().equals(name))
                return employee;
        return null;
    } //search an employee

    public void addEmployee(Employee e) {
        allEmployees.add(e);
    } //add an employee to the array list
}