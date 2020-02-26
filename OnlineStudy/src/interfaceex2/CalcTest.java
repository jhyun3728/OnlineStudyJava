package interfaceex2;

public class CalcTest {

	public static void main(String[] args) {
/*
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
		
		calc.description();
*/
		//static 메서드를 사용하면 위처럼 인스턴스 생성과 상관없이 아래처럼 사용가능 
		int[] arr = {1, 2, 3, 4, 5};
		int sum = Calc.total(arr); 			//인스턴스 변수로 사용하는 것이 아니라 인스턴스 타입을 써서 사용
		System.out.println(sum);	//ex) Calc calc = new CompleteCalc();
									//	  Calc.total(arr);   이런 식으로 타입을 사용하여 사용
	}

}
