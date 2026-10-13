// package Q5;

public class Day {
	
	private int year;
	private int month;
	private int day;
	
	//Constructor
	public Day(int y, int m, int d) {
		this.year=y;
		this.month=m;
		this.day=d;		
	}
	
	// check if a given year is a leap year
	static public boolean isLeapYear(int y)
	{
		if (y%400==0)
			return true;
		else if (y%100==0)
			return false;
		else if (y%4==0)
			return true;
		else
			return false;
	}
	
	// check if y,m,d valid
	static public boolean valid(int y, int m, int d)
	{
		if (m<1 || m>12 || d<1) return false;
		switch(m){
			case 1: case 3: case 5: case 7:
			case 8: case 10: case 12:
					return d<=31; 
			case 4: case 6: case 9: case 11:
					return d<=30; 
			case 2:
					if (isLeapYear(y))
						return d<=29; 
					else
						return d<=28; 
		}
		return false;
	}

	// Return a string for the day like dd MMM yyyy
	public String toString() {
		
		final String[] MonthNames = {
				"Jan", "Feb", "Mar", "Apr",
				"May", "Jun", "Jul", "Aug",
				"Sep", "Oct", "Nov", "Dec"};
		
		return day+" "+ MonthNames[month-1] + " "+ year;
	}
	
	static public boolean isEndOfAMonth(int y, int m, int d){
		switch(m){
			case 1: case 3: case 5: case 7:
			case 8: case 10: case 12:
					return d==31; 
			case 4: case 6: case 9: case 11:
					return d==30; 
			case 2:
					if (isLeapYear(y))
						return d==29; 
					else
						return d==28; 
		}
		return false;
	}
	
	public int getYear() {return year;}
	// Your tasks: add the following methods as well
	public int	getMonth() {
		return month;
	}
	public int	getDay() {
		return day;
	}

    public String nextDay() {
        if (month == 12 && day == 31) {
            return new Day(year + 1, 1, 1).toString();
        } else if (isEndOfAMonth(year, month, day)) {
            return new Day(year, month + 1, 1).toString();
        }

        return new Day(year, month, day + 1).toString();
    }

    public String previousDay() {
        if (month == 1 && day == 1) {
            return new Day(year - 1, 12, 31).toString();
        }

        if ( day==1 ) {
            int lastDays = 31;
            while (day==1 && !valid(year, month-1, lastDays)) {
                lastDays--;
            }
            return new Day(year, month - 1, lastDays).toString();
        }
        
        return new Day(year, month, day - 1).toString();
    }
}