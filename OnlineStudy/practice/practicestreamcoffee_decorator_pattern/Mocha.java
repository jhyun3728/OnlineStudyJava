package practicestreamcoffee_decorator_pattern;

public class Mocha extends Decorator{

	public Mocha(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brewing() {
		super.brewing();
		System.out.print("Adding Mocha Syrup ");
	}
	
	

	
	
}
