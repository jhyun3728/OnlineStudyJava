package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1);	//내림차순
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		//String에 이미 Comparable이 구현이 되어있다. --> Comparator를 이용해서 내림차순을 구현해보자
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());	//TreeSet에 MyCompare 인스턴스를 생성해서 
																		//원래의 compareTo 말고 새로 정의한 MyCompare을 사용하게끔 지정했다.
		treeSet.add("홍길동");
		treeSet.add("이순신");
		treeSet.add("김유신");
		
		for (String t : treeSet) {
			System.out.println(t);	//ㄱ, ㄴ, ㄷ 순으로 정렬이 된다.  //String에 이미 Comparable이 구현이 되어있기 때문에 가능 
		}
	}

}
