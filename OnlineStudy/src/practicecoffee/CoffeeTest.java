package practicecoffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Person Lee = new Person("Lee", 10000);
		Person Kim = new Person("Kim", 10000);
		
		StarCoffee sCoffee = new StarCoffee();
		BeanCoffee bCoffee = new BeanCoffee();
		
		Lee.buyStarCoffee(sCoffee, Menu.STARAMERICANO);
		Kim.buyBeanCoffee(bCoffee, Menu.BEANLATTE);
	}

}
