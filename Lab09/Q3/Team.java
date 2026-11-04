import java.util.ArrayList;

public class Team implements Comparable<Team>{
    private String teamName;
    private Employee head;
    private Day dateSetup;

    public Team(String teamName, Employee head, Day dateSetup){
        this.teamName = teamName;
        this.head = head;
        this.dateSetup = dateSetup;
    }

    public String toString(){
        return String.format(
            "%-30s%-10s%-13s", 
            teamName, 
            head.getName(), 
            dateSetup
        );
    }

    public String getTeamName() {
        return teamName;
    }

    public Employee getHead() {
        return head;
    }

    @Override 
    public int compareTo(Team otherTeam){
        return this.teamName.compareTo(otherTeam.teamName);
    }

    public static void list(ArrayList<Team> list) {
        if (list.isEmpty()) {
            System.out.printf("No any team\n");
            return;
        }

        System.out.printf("%-30s%-10s%-13s\n", "Team Name", "Leader", "Setup Date");
        for (Team team: list){
            System.out.printf("%s\n", team);
        }
    }
}