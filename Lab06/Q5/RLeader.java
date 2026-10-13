public class RLeader implements Role 
{
	
	public String genTeamContactMsg(Team team)
	{
		String teammates = team.getStringOfNormalMembers();
		return "Please contact your members: "+teammates; 
	}
	
	
	public String getNameAndRole(Member member)
	{
		return String.format("%s[Leader]", member.getName()); 
	}	

    public String genRoleDesciption(Member member) {
        return String.format("%s is the leader", member.getName());
    }
}