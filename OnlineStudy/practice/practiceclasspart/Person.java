package practiceclasspart;

public class Person {
	
	int age;
	String name;
	boolean isMarried;
	int babies;
	
	public void showInfo() {
		System.out.println("나이 : " + age + "\n이름 : " + name + "\n결혼여부 : " + isMarried + "\n자녀 수 : " + babies);
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.age = 04;
		p1.name = "James";
		p1.isMarried = true;
		p1.babies = 3;
		
		p1.showInfo();
	}

}
