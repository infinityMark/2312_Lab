import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
	   System.out.print("Please enter the date (eg. \"2013 12 31\"): ");
	   
	   Scanner scannerObj = new Scanner(System.in);
	   int y, m, d;
	   y=scannerObj.nextInt();
	   m=scannerObj.nextInt();
	   d=scannerObj.nextInt();
	   
	   if (Day.valid(y, m, d)==false) //check whether the input is valid
	   {
		   System.out.println("Wrong input.  Program stopped.");
	        scannerObj.close();
           return;
	   }
	   
        Day dayObj = new Day(y,m,d); //create a Day object for the input
		System.out.println("\nYou have entered " + dayObj.toString());

		System.out.printf("\nIt is%s a Leap Year.", (Day.isLeapYear(dayObj.getYear()) ? "": " NOT"));
		System.out.printf("\nIt is%s the end of the month.", (Day.isEndOfAMonth(dayObj.getYear(),dayObj.getMonth(),dayObj.getDay()) ? "": " NOT"));

		System.out.printf("\nThe next day is %s.", dayObj.nextDay());
		System.out.printf("\nThe previous day is %s.", dayObj.previousDay());

	    scannerObj.close();
   }
}
