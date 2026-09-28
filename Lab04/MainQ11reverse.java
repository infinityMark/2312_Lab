import java.util.*;

public class MainQ11reverse
{
	
	// todo: Add required methods below
	//	

	
	
	// Return an integer that is the reversed version of the input integer x (without the 0 digit). eg. 1234=>4321 
	static int reverse(int x)
	{	
		//todo
	}


	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int x;
		System.out.print("input x (-1 to end) : "); x=s.nextInt();

		while (x!=-1)
		{
			System.out.println(reverse(x));
			
			System.out.print("input x (-1 to end) : "); x=s.nextInt();
		}

		s.close();
	}
}
