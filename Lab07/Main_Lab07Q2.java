class A {
	
	private int i;
	private static int j;
	
	public static void f1() {
		i++;	//line 1
	}
	
	public void f2() {
		i++;	//line 2
	}
	
	public static void f3() {
		j++;	//line 3
	}	
	
	public void f4() {
		j++;	//line 4
	}
	
}


public class Main_Lab07Q2 
{
	public static void main(String[] args) 
	{
		A obj = new A();
		
		obj.f1();	//line 5
		obj.f2();	//line 6
		..
	}
}
