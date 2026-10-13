// import javax.management.relation.Role;

public class RDisappeared implements Role
{
	public String genTeamContactMsg(Team team)
	{
		Member leader = team.getLeader();
		if (leader == null)
			return "There is no leader in your team.  Please contact your instructor.";
		else
			return "When you are back, please contact your leader: " + leader.getName();
	}
	
	public String getNameAndRole(Member member)
	{
		return String.format("%s[x]", member.getName());
	}

    public String genRoleDesciption(Member member) {
        return String.format("%s is a disappeared member", member.getName());
    }
}