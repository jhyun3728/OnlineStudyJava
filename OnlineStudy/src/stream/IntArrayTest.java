package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(arr).sum();	//배열은 Arrays를 써서 stream() 사용 
		int count = (int)Arrays.stream(arr).count();  //Arrays.stream()은 한번 쓰면 다시 못씀. 다시 생성해서 써야함 //.count()가 long 타입 반환이여서 (int)형변환.
		
		System.out.println(sum);
		System.out.println(count);
		
		System.out.println();
		System.out.println("reduce() 연산");
		System.out.println(Arrays.stream(arr).reduce(0,  (a, b) -> a + b));	//1부터 5까지 다 더 함 
	}

}
