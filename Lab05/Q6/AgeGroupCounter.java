public class AgeGroupCounter extends Counter
{
	private int upperAge;
	private int lowerAge;
	
	public AgeGroupCounter(int upperAge, int lowerAge)
	{
		this.upperAge = upperAge;
		this.lowerAge = lowerAge;
	}
	
	public void countData(Record r) {
		if (r.getAge() >= lowerAge && r.getAge() <= upperAge)
			super.countData(r);
	}
	
	public String toString()
	{
		return String.format("[Age %d to %d] Count = %d", lowerAge, upperAge, getCount());
	}

}
