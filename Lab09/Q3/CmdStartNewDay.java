public class CmdStartNewDay extends RecordedCommand{
    private String previousday;

    @Override
    public void execute(String[] cmdStrings) {
        previousday = SystemDate.getInstance().getDay().toString(); 
        SystemDate.getInstance().set(cmdStrings[1]);

        clearRedoList();
        addUndoCommand(this);
        System.out.println("Done.");
    }

    @Override
    public void undoMe(){
        String temp = SystemDate.getInstance().getDay().toString();
        SystemDate.getInstance().set(previousday);
        previousday = temp;
        addRedoCommand(this);
    }
    
    @Override
    public void redoMe(){
        String temp = SystemDate.getInstance().getDay().toString();
        SystemDate.getInstance().set(previousday);
        previousday = temp;
        addUndoCommand(this);
    }
}