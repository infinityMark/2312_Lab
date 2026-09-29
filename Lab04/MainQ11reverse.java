import java.util.*;

public class MainQ11reverse
{
	
	// todo: Add required methods below
	static int power(int base, int exponent) {
		if (exponent == 0) return 1;
    	return base * power(base, exponent - 1);
	}
	
	static int countDigits(int x)
	{	
		if (x < 10) {
			return 1;
		} 
		int leading = x/10;
		return 1 + countDigits(leading);
	}

	static int leftMostDigit(int x)
	{	
		if (x < 10) {
			return x;
		} 
		int leading = x/10;
		return leftMostDigit(leading);	
	}	
	
	// Return an integer that is the reversed version of the input integer x (without the 0 digit). eg. 1234=>4321 
	static int reverse(int x)
	{	
		if (x < 10) {
			return x;
		}
		int length = countDigits(x) - 1;
		double originLength = power(10, length);
		int right_most = x%10;
		return (int)Math.round(right_most*originLength + reverse(x/10));
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
