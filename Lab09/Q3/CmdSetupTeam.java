public class CmdSetupTeam extends RecordedCommand{
    private Team team;

    @Override
    public void execute(String[] cmdStrings){
        Company compnay = Company.getInstance();
        team = new Team(cmdStrings[1], 
            compnay.searchEmployee(cmdStrings[2]), 
            SystemDate.getInstance().getDay());
        compnay.createTeam(cmdStrings[1], cmdStrings[2]);

        clearRedoList();
        addUndoCommand(this);
        System.out.println("Done.");
    }

    @Override
    public void undoMe(){
        Company company = Company.getInstance();
        company.disbandTeam(team.getTeamName());
        addRedoCommand(this);
    }
    
    @Override
    public void redoMe(){
        Company company = Company.getInstance();
        company.createTeam(
            team.getTeamName(), team.getHead().getName()
        );
        addUndoCommand(this);
    }
}