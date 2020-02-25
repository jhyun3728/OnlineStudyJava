package abstractex;

public abstract class Computer {
	
//	public void display() {}; //{}가 있으면 바디가 있는거임 -> abstract(추상) 메서드가 아님
	public abstract void display();	//바디를 작성하지않고 ;으로 마무리하면 '여기서 구현하지 않겠다'는 뜻 -> abstract 메서드
	public abstract void typing();  //추상클래스는 단독으로 사용하려고 만들지 않고 주로 상위클래스로 만들려고 구성함
									//즉, 상속받은 클래스가 구현해야한다
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
