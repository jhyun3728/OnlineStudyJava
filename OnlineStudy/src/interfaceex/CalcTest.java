package interfaceex;

public class CalcTest {

	public static void main(String[] args) {

		CompleteCalc calc = new CompleteCalc(); //CompleteCalc만 모든 추상 메서드가 되었으므로 CompleteCalc 인스턴슴나 가능(CompleteCalc만 new 가능)
		//CompleteCalc은 Calc, Calculator 클래스를 포함하므로 타입에는 Calc, Calculator 둘다 올 수 있다.
		//But!! 다른 타입을 쓸 경우, CompleteCalc 클래스에만 있는 showInfo() 메서드는 사용불
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		calc.showInfo();
	}

}
