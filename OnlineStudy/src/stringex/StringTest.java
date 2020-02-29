package stringex;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");  //힙메모리에 올라가므로 힙메모리에 있는 값을 가져다 씀 
		
		System.out.println(str1 == str2);  //str1과 str2의 메모리 위치가 다르므로 false가 나온다.
											//equals()는 같음
		String str3 = "abc";
		String str4 = "abc";	//직접 넣는거는 상수풀에 들어감 
		
		System.out.println(str3 == str4);  //리터럴들이 모여있는 상수풀에서 가져오므로 둘이 같음. true
	}

}
