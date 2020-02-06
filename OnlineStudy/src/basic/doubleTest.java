package basic;

public class doubleTest {

	public static void main(String[] args) {
		double dNum = 3.14;
		
		float fNum = 3.14f; 
		//3.14는 실수여서 double로 인식하지만 float로 인식하라고 f를 붙여준다.
		//대문자나 소문자 상관없음
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		//부동소수점 오류 예제 
		double dNum2 = 1;
		
		for(int i = 0; i< 10000; i++) {
			dNum2 = dNum2 + 0.1;
		}
		System.out.println(dNum2);
		//1001.0000000000159로 오차가 생김  
		
		boolean isMarried = false;
		
		System.out.println(isMarried);
		
		//var i = 10; 자바10부터는 가능 
	}

}
