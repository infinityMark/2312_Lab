public class SystemDate extends Day{
    private static SystemDate system = null;

    private SystemDate(String string){
        super(string);
    }

    public static SystemDate getInstance() {
        return system;
    }

    public Day getDay() { return system.clone(); }

    public static void createTheInstance(String sDay){
        if(system == null) system = new SystemDate(sDay);
        else System.out.println("Cannot create one more system date instance.");
    }
}
