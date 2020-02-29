package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {		//memberId라는 키 값이 hashMap 안에 있는지 확인
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 없습니다."); 
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();	//Iterator가 순회할 애는 Integer이므로 <Integer>해준다.
		//keySet()은 모든 key 객체를 반환해준다. key는 중복되지 않기 때문에 Set<T> 타입으로 반환된다. //iterator()가 키로 순회한다.
	
		//	hashMap.values().iterator();
		//values()는 모든 key 객체를 반환해준다. key가 중복이 될 수 있어서 Set이 아니라 Collection으로 반환된다.//iterator()하면 이때는 value로 반환된다.
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}