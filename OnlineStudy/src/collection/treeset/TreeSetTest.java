package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("이순신");
		treeSet.add("김유신");
		
		for (String t : treeSet) {
			System.out.println(t);	//ㄱ, ㄴ, ㄷ 순으로 정렬이 된다.  //String에 이미 Comparable이 구현이 되어있기 때문에 가능 
		}
	}

}
