package collection.treemap;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap manager = new MemberHashMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "KLim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);	//중복 안됨 --> HashMap<Integer, Member> hashMap; 에서 Integer에 이미 equals와 hashCode가 구현이 되어있어서  

		manager.showAllMember();	
		
		manager.removeMember(200);
		manager.showAllMember();
	}

}
