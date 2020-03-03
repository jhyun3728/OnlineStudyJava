package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) 
			return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = {"안녕하세요~~~~", "hello", "Good mornig", "반갑습니다"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> //처음에는 아무거도 없는 ""와 비교 
			{ if(s1.getBytes().length >= s2.getBytes().length) 
				return s1;
			else return s2;
			
			}));
		//위 방식이 복잡하다면 위 방식의 구현부를 클래스로 만들어 그 안에다가 구현해서 사용하면 된다.
		//여기서는 바이트의 길이를 비교할꺼여서 BinaryOperator<T>를 implements 했다. 
		
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());	
		//reduce()에다가 바로 new CompareString()으로 객체를 생성해서 사용한 뒤 그걸 .get()으로 받아오면 된다.
		
	}
}
