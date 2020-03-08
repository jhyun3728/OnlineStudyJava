package practicestreamcoffee_decorator_pattern;

public class Latte extends Decorator {
	
	public Latte(Coffee coffee) {	//이 컨스트럭터가 Coffee를 가지고 있어서 케냐 아메리카노도 들어올 수 있지만 다른 커피도 들어 올 수 있다!!!
									//컴포넌드(케냐), 데코레이더(Decoraotr)가 하나의 클래스(Coffee)를 상속받아 같은 Operation을 제공한다.
		super(coffee);	//extends Deocrator를 하면 하나의 커피를 꼭 가져오게 된다.
	}
	
	public void brewing() {
		super.brewing();
		System.out.print("Adding Milk ");
	}
}
