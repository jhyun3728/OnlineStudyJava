package interfaceex;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);		//어떠한 일들을 하라고 인터페이스 선언
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
