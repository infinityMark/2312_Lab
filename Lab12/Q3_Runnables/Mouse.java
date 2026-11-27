public class Mouse extends Animal{
    private int speed;

    public Mouse(String name){
        super(name);
        speed = 2;
    }

    @Override
    public int getRunSpeed(){
        return speed;
    }

    @Override 
	public String getMyName() { return super.getName(); }
}
