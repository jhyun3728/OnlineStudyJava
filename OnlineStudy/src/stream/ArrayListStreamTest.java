package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		 List<String> sList = new ArrayList<String>();
		 sList.add("Tomas");
		 sList.add("Edward");
		 sList.add("Jack");
		 
		 Stream<String> stream = sList.stream(); //스트림 객체 생성 //컬렉션은 stream() 메서드를 호출해서 바로 생성 가능 
		 
		 stream.forEach(s -> System.out.print(s + " "));
		 System.out.println();
		 
		 sList.stream().sorted().forEach(s -> System.out.print(s + " "));  //sorted()는 String에서 Comparable이 구현되어 있어서 가능. 없는 타입이면 직접 구현
		 System.out.println();
		 
		 sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
  //sList.stream()까지가 생성하는 부분.//map연산은 해당되는 데이터  
	}

}
