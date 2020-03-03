package lambda;

public class TestMyNumber {

	public static void main(String[] args) {

		MyMaxNumber max = (x, y) -> (x >= y)?x : y;	//함수형 인터페이스에 선언한 메서드를 사용하기 위해 구현	
			//람다식은 중괄호를 생략할 수 있는 상황이면 생략하는게 좋음 //return은 구현부가 한줄이면 return이랑 중괄호 생략가능
			//함수 이름 안씀. 익명 --> 그래서 함수형 인터페이스에 메서드가 하나만 있어야함. (매개변수 개수가 같으면 어떤 메서드를 쓰는지 모르니까)
		System.out.println(max.getMaxNumber(10, 20)); 	//구현한 메서드 호출 
	}

}