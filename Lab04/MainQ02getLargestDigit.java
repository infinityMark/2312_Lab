import java.util.*;

public class MainQ02getLargestDigit
{
	//Return the largest digit in an integer n.
	static int getLargestDigit(int n)
	{
		if (n<10)
		{
			return n;
		}
		else
		{	
			int right_most = n%10;
			int leading = n/10;
			int right_most_new = getLargestDigit(leading);
			return (right_most>right_most_new) ? right_most : right_most_new;
		}
	}

	public static void main(String[] args)
	{
		System.out.print("Input n: ");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		System.out.println(getLargestDigit(n));

		s.close();
	}
}
