public class RNormalMember __________________________//It should be: public class RNormalMember implements Role 
{
	//Generate team contact message for the member
	public String genTeamContactMsg(Team team)
	{
		Member leader = ____________________; //call team.getLeader();
		if (leader==______________) //is it null? compare with: null
			return "There is no leader in your team.  Please contact your instructor.";
		else
			return "Please contact your leader: " + _____; //call leader.getName();
	}
	
	//Return name[+role] strings
	public String getNameAndRole(Member member)
	{
		return _________________; // simply: member.getName();
	}	
}