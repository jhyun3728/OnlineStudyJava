package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");	//ArrayList와 같이 기본 컬렉션으로 add, toString 등이 있다. 
		
		System.out.println(myList); //기본 컬렉션으로 toString이 있어 문자를 바로 보여준다.  //[A, B, C] 
		
		myList.add(1, "D");  //1번 인덱스에 D를 넣고 나머지는 뒤로 미뤄진다.
		System.out.println(myList);
		
		myList.removeLast();  //리스트의 마지막 인덱스 제거
		System.out.println(myList);
		
		for(int i = 0; i < myList.size(); i++) {
			String s = myList.get(i);  //get()은 몇번째를 지정해 줄 수 있지만 set은 지정 못함  //get은 List쪽에만 있는 컬렉션임 
			System.out.println(s);			//set은 중복을 허용하지 않고 데이터를 관리함 (순서에 기반하지 않음)
		}
	}

}
