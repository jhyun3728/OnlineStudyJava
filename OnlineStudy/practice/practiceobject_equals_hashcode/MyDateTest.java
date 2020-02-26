package practiceobject_equals_hashcode;

class MyDate {
	int day, month, year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			return ((this.day == date.day) && (this.month == date.month) && (this.year == date.year));
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (day*month*year);
	}
	
	
}

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(31, 12, 2020);
		MyDate date2 = date1;
		MyDate date3 = new MyDate(31, 12, 2020);
		
		System.out.println(date1 == date2);
		System.out.println(date1 == date3);
		System.out.println(date1.equals(date3));
		
		
		
	}
}
