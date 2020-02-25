package practicecoffee;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "짜리 " + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "짜리 " + message);
		}
	}
	
	public void showMoneyInfo() {
		System.out.println(name + "이 가진 돈은 " + money + "입니다");
	}
}
