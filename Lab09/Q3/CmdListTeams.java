public class CmdListTeams implements Command{
    @Override
    public void execute(String[] cmdStrings){
        Company company = Company.getInstance();
        company.listTeams();
    }
}
