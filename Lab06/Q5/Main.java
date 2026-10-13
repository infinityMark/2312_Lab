import java.util.*;
import java.io.*;

public class Main{

	public static void main(String [] args) throws FileNotFoundException
	{	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input the file pathname of each team: ");
		String filepathname = in.nextLine();

        ArrayList<Team> teamCollection = new ArrayList<>();
		
        String[] filepathnames = filepathname.split("\\s+");
        for (String path : filepathnames) {
            teamCollection.add(new Team(path));
        }
		
		System.out.printf(
			"\nListing of teams:\n %s\n\n", 
			    Team.getStringOfAllTeams(teamCollection));

        System.out.print("Enter a name for searching:");
        String searchName = in.next();
		
		System.out.printf("\nResult: %s", Team.searchMember(teamCollection, searchName));
		
		in.close();
	}
}