package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); // <String> -> 내가 어떤 요소를 쓸건지 미리 선언하는 것  (쓰는걸 권장 / 안쓰면 노란줄 뜸)
		
		list.add("aaa");	//String은 new 하지않고 바로 쓸 수 있음
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0; i < list.size(); i++) {	//.size() 는 엘리먼트의 개수를 나타냄 	//.length 는 배열의 길이가 10이면 엘리먼트가 3개여도 10을 반환
			String str = list.get(i);	//만약 위에 <String>을 안썼으면 오류가 남 -> 오류 잡으려면 String str = (String)list.get(i);로 (String) 직접 변환해줘야함
			System.out.println(str);
		}
		
		for(String s : list) {	//만약 위에 <String>을 안썼으면 오류가 남 -> 오류 잡으려면 for(Object s : list)로  해야함 //ArrayList가 Object로 반환하기 때문
			System.out.println(s);
		}
	}

}
