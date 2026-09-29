import java.util.*;

public class MainQ10areOpposite
{
	
	// todo: Add required methods below
	static int tail(int x)
	{	
		if (x < 10) {
			return 0;
		}
		int leading = x/10;
		int right_most = x%10;
		return right_most + 10*tail(leading);
	}

	static int leftMostDigit(int x)
	{	
		if (x < 10) {
			return x;
		} 
		int leading = x/10;
		return leftMostDigit(leading);	
	}	

	// Determine whether the sequences of digits in 2 integers (without the 0 digit) are opposite to one another (eg. 123 and 321)
	static boolean areOpposite(int x1, int x2)
	{	
		if (x1<10 && x2<10) {return x1==x2;}
		
		int x2_right_most = x2%10;
		int x1_left_most = leftMostDigit(x1);
		if (x1_left_most!=x2_right_most) return false;
		return areOpposite(tail(x1), x2/10);
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
