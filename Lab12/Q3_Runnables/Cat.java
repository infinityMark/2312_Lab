public class Cat extends Animal{
    private int speed;
    
    public Cat(String name){
        super(name);
        speed = 5;
    }

    @Override
    public int getRunSpeed(){
        return speed;
    }

    @Override 
	public String getMyName() { return super.getName(); }

    void chase(Runnable target) {
        System.out.println(
            this.getMyName() + 
            (this.getRunSpeed() > target.getRunSpeed() ? " Catches ": " Cannot Catches ") + 
            target.getMyName()
        );
    }
}
