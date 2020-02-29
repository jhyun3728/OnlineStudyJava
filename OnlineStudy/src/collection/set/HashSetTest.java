package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("1번");
		arr.add("2번");
		arr.add("3번");
		arr.add("1번");		//중복 허용하고 1번, 2번, 3번, 1번 순으로 출력 
		
		System.out.println(arr);
		
		HashSet<String> set = new HashSet<String>();
		set.add("이순신");
		set.add("김유신");
		set.add("윤재현");
		set.add("이순신");	//중복 허용하지 않고 이순신, 김유신, 윤재현이 랜덤의 순서로 출력 
		
		System.out.println(set);
		
		
		
		System.out.println("=====Iterator=====");
		
		//Iterator를 이용한 순회 
		Iterator<String> ir = set.iterator(); //순회하는 엘리먼트를 지정 가능 <String>
		
		while(ir.hasNext()) {	//.hasNext() --> 다음 엘리먼트가 있으면 true 없으면 false
			String str = ir.next();	//다음 엘리먼트를 가져온다.
			System.out.println(str);
		}
	}
}
