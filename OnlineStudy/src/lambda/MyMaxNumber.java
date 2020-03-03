package lambda;

//함수 구현할 인터페이스 
@FunctionalInterface	//이 애노테이션을 써주면 함수형 인터페이스 (람다식을 위한 인터페이스)라는 의미
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);	//구현 할 메서드 선언 --> 구현은 실행 클래스에 가서 구현해서 사용 
	//void add(int x, int y);  //오류 --> 함수형 인터페이스는 메서드를 2개 이상 선언할 수 없다!!!!!! @FunctionalInterFace가 선언되지 않은 인터페이스는 가능 
	
	//사용할때 함수 이름 안씀. 익명 --> 그래서 함수형 인터페이스에 메서드가 하나만 있어야함. (매개변수 개수가 같으면 어떤 메서드를 쓰는지 모르니까)
	
}
