package collection.hashmap;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "KLim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);	//TreeMap<Intger, Member>에 Key값이 Interger이여서 정렬이 된다. 
										
		manager.showAllMember();	
		
		manager.removeMember(200);
		manager.showAllMember();
	}

}