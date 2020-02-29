package collection.treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "KLim");
		Member memberPark = new Member(300, "Park");	//String 클래스가 아니므로 비교 정렬을 위해 Member 클래스에 implements Comparable<Member> 해주고
															//compareTo()를 오버라이딩해서 원하는 방식으로 정렬해준다.
															//반환값 (this.memberId - memberId(매개변수));가 양수이면 오름차순이고 *(-1)을 해서 음수면 내림차순
															//return this.memberName.compareTo(member.getMemberName()); --> 이름 정렬 
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();	
		
		manager.removeMember(100);
		manager.showAllMember();
	}

}
//Comparable 말고 다른 방법 --> implements Comparator<Member>