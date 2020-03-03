package lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "World");		//이 방식이 여태 사용하던 방식의 인터페이스 사용 
		
		System.out.println();
		//람다
		StringConcat concat = (s,v) -> System.out.println(s + "," + v); //이 부분만 있으면 클래스 구현도 필요없다. 클래스 구현해서 함수부분 따로 구현할 필요 없음	
		concat.makeString("hello", "world");
		
		
		StringConcat concat2 = new StringConcat() { //new해서 익명 내부 클래스를 만들 수 있다. --> 실제로는 람다식을 구현하지만 내부에는 익명 객체가 생성이 된다.
													//즉 람다 내부에서 이런식으로 돌아가기 때문에 첫번째 방법처럼 안해도 같은 결과를 얻을 수 있다. 
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);	
			}
		};
		
		concat2.makeString("hello", "world");
	}

}
