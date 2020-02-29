package collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "KLim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);	 //같은 memberId를 가졌는데 add가 된다. --> Member에 대해서 memberId가 같으면 같은 member라고 논리적인 구현이 되지 않았기 떄문
																		//Member 클래스 가서 구현해야한다. --> equals와 hashCode 오버라이딩
																		//String은 이미 JDK안에서 정의가 되어 있기 때문에 중복이 안되는 것
																		//Member 클래스에서 논리적 구현을 해서 이제 중복 안됨 
		
		//Set을 쓸때 (Ex. HashSet<T>) Set이 관리할 Object가 (<T>) 논리적으로 같다라는 정의가 되어있는지 확인 필수 --> 없으면 해야함 (equals, hashCode) 
		// ex) HashSet, TreeSet 클래스 
		
		manager.showAllMember();	//순서 상관없이 들어가는걸 볼 수 있다.
		
		manager.removeMember(100);
		manager.showAllMember();
	}

}
