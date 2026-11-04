import java.util.ArrayList;

public class Employee implements Comparable<Employee>{
    private String name;
    private int annualLeaves;

    public Employee(String n, int d){
        name = n;
        annualLeaves = d;
    }

    @Override 
    public int compareTo(Employee another){
        return this.name.compareTo(another.name);
    }

    public String getName() { return name; }

    public static Employee searchEmployee(ArrayList<Employee> list, String name){
        for(Employee employee: list){
            if (employee.getName().equals(name)) return employee;
        }
        return null;
    }
}