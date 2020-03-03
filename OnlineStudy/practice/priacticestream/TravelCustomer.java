package priacticestream;

public class TravelCustomer {
	private int age;
	private int cost;
	private String name;
	
	public TravelCustomer(String name, int age, int cost){
		this.age = age;
		this.cost = cost;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + ", " + age + ", " + cost;
	}
}
