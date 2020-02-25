package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

//		Computer computer = new Computer();	//인스턴스화가 될 수 없다. //Computer 클래스에서 구현되지 않은 typing()과 display()의 추상 메서드 때문
		Computer computer = new Desktop();
		computer.display();
		computer.turnOff(); //만약 Desktop 클래스에 turnOff() 메서드가 따로 있으면 추상메서드 말고 Desktop클래스의 turnOff 메서드가 실행된다.
		
		Computer myNotebook1 = new MyNotebook();
		Notebook myNotebook2 = new MyNotebook();
		MyNotebook myNotebook3 = new MyNotebook();  //MyNotebook 인스턴스는 Computer, Notebook, MyNotebook 모두 가능 (상위 클래스들이라서)
	}

}
