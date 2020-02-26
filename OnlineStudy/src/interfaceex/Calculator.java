package interfaceex;

public abstract class Calculator implements Calc{ //모든 추상 메서드를 구현하지 않기 때문에 abstract 클래스가 된다 

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}


}
