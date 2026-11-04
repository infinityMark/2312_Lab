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

    public void listEmployees() { Employee.list(allEmployees); }

    public Employee createEmployee(String name, int date) {
        Employee e = new Employee(name, date);
        allEmployees.add(e);
        Collections.sort(allEmployees);
        return e; 
    }

    public Employee searchEmployee(String name) {
        return Employee.searchEmployee(allEmployees, name);
    }

    public Team createTeam(String teamName, String leadeString) {
        Team e = new Team(teamName, 
            Employee.searchEmployee(allEmployees, leadeString), 
            SystemDate.getInstance().getDay());
        allTeams.add(e);
        Collections.sort(allTeams);
        return e; 
    }

    public boolean fireEmployee(String name) {
        for (int i = 0; i < allEmployees.size(); i++) {
            if (allEmployees.get(i).getName().equals(name)) {
                allEmployees.remove(i);
                return true;
            }
        }
        return false; 
    }

    public boolean disbandTeam(String teamNamString) {
        for (int i = 0; i < allTeams.size(); i++) {
            if (allTeams.get(i).getTeamName().equals(teamNamString)) {
                allTeams.remove(i);
                return true;
            }
        }

        return false;
    }
}