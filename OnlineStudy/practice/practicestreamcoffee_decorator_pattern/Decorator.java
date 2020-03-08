package practicestreamcoffee_decorator_pattern;

public abstract class Decorator extends Coffee{	//이 클래스는 new로 만들것이 아니기 떄문에 abstract하자 

	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {

		coffee.brewing();
	}
}
