package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {

		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyString(lambdaStr);  //구현부가 바로 위에 이미 구현이 되어 있으므로 구현된 변수를 매개변수로 넣어준다.
		
		PrintString test = returnString();	//람다의 구현부를 변수처럼 받아서 변수처럼 대입이 되고 메서드가 호출이 될 수 있다. 
		test.showString("Test3");
	}

	//매개변수로도 받을 수 있음
	public static void showMyString(PrintString p) {
		p.showString("Test2"); 
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!"); //이 람다식 구현부 자체가 반환이 된다. 
	}
}