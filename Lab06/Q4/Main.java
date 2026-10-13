import java.util.*;
import java.io.*;

public class Main{

	public static void main(String [] args) throws FileNotFoundException
	{	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input the file pathname: ");
		String filepathname = in.nextLine();
		
		Team t = new Team(filepathname);
		
		System.out.printf(
			"\nThere are %d members in the team: %s\n\n", 
			t.getMemberCount(), t.getStringOfAllMembers()); 

        System.out.print("Enter new leader:");
        String newLeader = in.next();
        t.changeLeader(newLeader);
		
		System.out.printf("\nResult: %s", t.getStringOfAllMembers());
		
		in.close();
	}
}