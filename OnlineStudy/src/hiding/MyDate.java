package hiding;

public class MyDate {
	private int day;	//다른 패키지에서 땡겨쓸 수 있게하려면 public int로 하면된당
	private int month;	//모든것들을 private으로 할 필요는 없음
	private int year;	//MyDateTest에서 쓰려면 public 메소드 안에 this.를 사용하여 값을 지정할 수 있게끔 함
	
	private boolean isValid;
	
	public void setDay(int day) {
		if(month < 1 || month > 31) {
			isValid = false;
		}
		else
			this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	//우클릭 - source - Generate Getters and Setters 하면 밑에처럼 get, set 자동으로 생성
	
	public int getMonth() {		
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}
		else
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다");
		}
	}
}
