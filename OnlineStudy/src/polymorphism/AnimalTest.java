package polymorphism;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		System.out.println("동물이 먹습니다"); //eating처럼 다른 동물도 쓸수있는 메서드면 오버라이딩으로 하는게 유연함 
											//독수리의 flying처럼 특정 인스턴스만 가능한 메서드만 다운캐스팅한다
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {	//이거는 hAnimal. 해도 안나옴 
		//--> hAnimal이 Animal 클래스로 선언되었기 때문에 Human 클래스로 다시 만들어줘야 사용가능 (다운캐스팅) Ex) Human human = (Human)hAnimal;
		System.out.println("사람이 책을 읽습니다."); 
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		//Eagle human1 = (Eagle)hAnimal; //실행시키면 오류남 //Human 인스턴스를 Eagle로 인스턴스하려고해서 //다른 페이지나 매개변수에서 이렇게되면 찾기 힘들수도 그래서 if문으로 방지
		if(hAnimal instanceof Human) {	//instanceof는 hAnimal이 정말 Human 탑입의 인스턴스가 맞느냐에 대해 true / false 반환
			Human human = (Human)hAnimal;
			System.out.println("instanceof 출력문");
			human.readBooks();
		}
		
		
		System.out.println();
		System.out.println("다운캐슼팅");
		Human human = (Human)hAnimal;  //다운캐스팅
		human.readBooks();   //다운 캐스팅을 통해 .readBooks()라는 메서드 사용 가능해짐  
							//hAnimal은 Animal 클래스의 인스턴스이므로 Human 클래스로 선언해주고 hAnimal을 Human으로 다운캐스팅해준것을 대입
		
		System.out.println();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		System.out.println();
		System.out.println("ArrayList와 향상된 for문 사용해서 출력");
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
		
		System.out.println();
		AnimalTest dcTest = new AnimalTest();
		dcTest.testDownCasting(animalList);
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		System.out.println("DownCasting 메서드 출력문");
		for(int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {		//안정성 Up!
				Human human = (Human)animal;
				human.readBooks();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();		//하나의 코드가 여러 자료형을 실행 --> 다형성 polymophism	//여러 타입들이 다 Animal이므로 가능
	}
}