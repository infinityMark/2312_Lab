import java.util.*;

public class MainQ10areOpposite
{
	
	// todo: Add required methods below
	//	
	
	

	// Determine whether the sequences of digits in 2 integers (without the 0 digit) are opposite to one another (eg. 123 and 321)
	static boolean areOpposite(int x1, int x2)
	{	
		//todo
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int x1,x2;
		System.out.print("input 2 integers, separated by a space (\"-1 -1\" to end) : "); 
		x1=s.nextInt();x2=s.nextInt();

		while (x1!=-1)
		{
			if (areOpposite(x1,x2)) 
				System.out.println("true");
			else
				System.out.println("false");
			
			System.out.print("input 2 integers, separated by a space (\"-1 -1\" to end) : "); 
			x1=s.nextInt();x2=s.nextInt();
		}

		s.close();
	}
}
