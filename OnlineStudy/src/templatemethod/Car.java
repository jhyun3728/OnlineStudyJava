package templatemethod;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} //{}는 바디가 존재한다는 것이므로 하위 클래스에서 오버라이딩로 재정의해줘야함  //추상 메서드와 다르게 특정 클래스에서만 재정의해서 기능 추가 가능
							 //{}를 안쓰면 추상 메서드로 모든 하위 클래스들이 메서드 선언하지 않으면 오류가 남 --> 강제 버전업
	final public void run() {  //바디에 있는 함수들의 내용은 바뀌어도 되지만 순서는 바뀌면 안됨(template) --> final로 선언
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
