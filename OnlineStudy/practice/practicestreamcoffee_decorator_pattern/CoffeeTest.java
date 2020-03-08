package practicestreamcoffee_decorator_pattern;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee americano = new KenyaAmericano();
		americano.brewing();
		System.out.println();
		
		Coffee kenyaLattee = new Latte(new KenyaAmericano());
		kenyaLattee.brewing();
		System.out.println();
		
		Coffee kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
		kenyaMocha.brewing();
		System.out.println();
		
		//Latte와 Mocha가 Decorator가 되고 이 Decorator가 생성자의 또 다른 데코레이터를 받을 수 도 있고 컴포넌트도 받을 수 있다. (제일 안에는 컴포넌트가 와야함)
		
		
		Coffee etiopiaaMocha = new Mocha(new Latte(new EtiopiaAmericano()));
		etiopiaaMocha.brewing();
		
		
		//이런식의 구조로 되어있는데 데코레이터 패턴 *****************
	}

}
