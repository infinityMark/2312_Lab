import java.util.*;
import java.io.*;

public class Team{

    private ArrayList<Member> allMembers;
    private Member leadMember;
	
	public Team(String filepathname) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new File(filepathname));
		
		int tot = inFile.nextInt();
		inFile.nextLine();
		// allMembers = new Member[tot];

		for (int i = 0; i < tot; i++)
		{
			String name = inFile.next();
			char role = inFile.next().charAt(0);

            Role r = roleSelection(role);
			allMembers.add(new Member(name, r));

            if (role == 'l')
                leadMember = allMembers.getLast();
		}				
		inFile.close();
	}

    public Role roleSelection(char role) {
        switch(role) {
            case 'l' : return new RLeader();
            case 'n' : return new RNormalMember();
            case 'd' : return new RDisappeared();
        }
        return null;
    }
	
	public int getMemberCount() { return allMembers.size(); }	
	
	public String getStringOfAllMembers()
	{
		String result="";
		for (Member member: allMembers)
				result += member.getNameAndRole() + " ";
		result=result.trim();
		return result;
	}
	
	public void printTeamContactMessages()
	{
		for (Member member: allMembers)
		{
			String name_i=member.getName();
			System.out.print("Dear " + name_i +", ");

            System.out.println(member.genTeamContactMsg(this));
		}
	}

    public Member getLeader() { return leadMember; };

    public String getStringOfNormalMembers() {
        String result = getStringOfAllMembers();
        result = result.replace(leadMember.getNameAndRole(), "");
        for (Member member: allMembers)
            if (member.getRole().getClass().getSimpleName() == "RDisappeared")
                result = result.replace(member.getNameAndRole(), "");
        return result;
    };
}