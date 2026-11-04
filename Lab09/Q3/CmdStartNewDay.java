public class CmdStartNewDay implements Command{
    @Override
    public void execute(String[] cmdStrings) {
        SystemDate.getInstance().set(cmdStrings[1]);
        System.out.println("Done.");
    }
}