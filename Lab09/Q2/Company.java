import java.util.ArrayList;
import java.util.Collections; //Provides sorting

public class Company{
    private ArrayList<Employee> allEmployees;
    private ArrayList<Team> allTeams;
    private static Company company = new Company();

    private Company() {
        allEmployees = new ArrayList<>();
        allTeams = new ArrayList<>();
    }

    public static Company getInstance() { return company; }

    public void listTeams() { Team.list(allTeams); }

    public Employee createEmployee(String name, int date) {
        Employee e = new Employee(name, date);
        allEmployees.add(e);
        Collections.sort(allEmployees);
        return e; 
    }

    public Employee fireEmployee(Employee employee) {
        for (Employee e : allEmployees) {
            if (Employee.searchEmployee(allEmployees, employee.getName()) != null) 
                return e;
        }
        return null; 
    }

    public Team createTeam(String teamName, String leadeString) {
        Team e = new Team(teamName, 
            Employee.searchEmployee(allEmployees, leadeString), 
            SystemDate.getInstance().getDay());
        allTeams.add(e);
        Collections.sort(allTeams);
        return e; 
    }
}