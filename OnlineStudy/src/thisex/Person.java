package thisex;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름 없음", 1); //안쓰면 NULL로 초기화 된다 //this로 다른 생성자를 호출할때 얘가 첫번째 문장이어야한다. 안그러면 에러
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void  showInfo() {
		System.out.println(name + "," + age);
	}
	
	public Person getSelf() {
		return this;
	}
}
