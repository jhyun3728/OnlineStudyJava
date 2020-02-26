package interfaceex2;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);		//어떠한 일들을 하라고 인터페이스 선언
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		//myMethod();
	}
	
	//static 메서드 
	static int total(int[] arr) {	//인스턴스 변수로 사용하는 것이 아니라 인스턴스 타입을 써서 사용
		int total = 0;				//ex) Calc calc = new CompleteCalc();
									//	  Calc.total(arr);   이런 식으로 타입을 사용하여 사용 
		for(int i: arr) {
			total += i;
		}
		//mystaticMethod();
		return total;
	}
	
	//static 메서드에서 일반 메서드 호출 못함 -> static 메서드는 인스턴스 생성하지 않고 호출 가능하므로 
	
	/*
	private void myMethod() { //오류 이유 -> java 9 부터 사용 가능 (현재 java 8)
		System.out.println("private method");
	}
	
	private static void mystaticMethod() {
		System.out.println("private static method");
	}
	*/
}
