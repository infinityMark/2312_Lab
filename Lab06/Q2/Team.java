import java.util.*;
import java.io.*;

public class Team{

    private Member[] allMembers = null;
	
	public Team(String filepathname) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new File(filepathname));
		
		int tot = inFile.nextInt();
		inFile.nextLine();
		allMembers = new Member[tot];

		for (int i = 0; i < tot; i++)
		{
			String name = inFile.next();
			allMembers[i] = new Member(name);
		}
				
		inFile.close();
	}
	
	
	public int getMemberCount() { return allMembers.length; }
	
	
	public String getStringOfAllMembers()
	{
		String result="";
		for (Member member: allMembers)
				result += member.getName() + " ";
		result=result.trim();
		return result;
	}

	
	public void printTeamContactMessages()
	{
		String allNames=getStringOfAllMembers();
		for (Member member: allMembers)
		{
			String name_i=member.getName();
			System.out.print("Dear " + name_i);
			String teammates = allNames.replace(name_i, "");
			System.out.println(",  please contact your teammates: " + teammates);
		}
	}	
}