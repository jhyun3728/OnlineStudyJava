package ifexample;

public class IfEx1 {

	public static void main(String[] args) {
		char gender = 'M';
		
		if(gender == 'F') {
			System.out.println("여성");
		} else {
			System.out.println("남성");
		}
		
		int age = 10;
		
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
		} else if(age < 14) {
			charge = 1500;
		} else if(age < 20) {
			charge = 2000;
		} else {
			charge = 3000;
		}
		
		System.out.println("나이 : " + age);
		System.out.println("요금 : " + charge);
	}

}
