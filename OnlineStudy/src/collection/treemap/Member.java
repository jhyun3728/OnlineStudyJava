package collection.treemap;

import java.util.Comparator;

//TreeSet에서 Member를 비교를 해야하는데 정의된 것이 없어 에러남. 숫자는 숫자를 비교하니까 가능하지만 다른 객체는 직접 구현해줘야한다. --> implements Comparable
public class Member implements Comparator<Member>{

	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memString) {
		this.memberId = memberId;
		this.memberName = memString;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}
	
	@Override
	public int hashCode() {
		return memberId;   //같은 멤버일때 같은 해쉬코드를 가지면 되는거니까 memberId를 반환 
	}
	
	@Override
	public boolean equals(Object obj) {
									//memberId가 같으면 같다는걸 표시
		if(obj instanceof Member) {
			Member member = (Member)obj; //obj를 다운캐스팅 
			return (this.memberId == member.memberId);	//같은지 여부 반환 
		}
		
		return false;
	}
	
	
	/*	//이거는 implements Comparable<Member> 일떄 
	@Override
	public int compareTo(Member member) {	//비교 방법 : this하고 매개변수랑 비교

		//return (this.memberId - member.memberId);	//여기서 양수를 반환하게 되면 오름차순으로 정리가 된다.
		//return (this.memberId - member.memberId) * (-1); //내림차순   
		return this.memberName.compareTo(member.getMemberName());  //이름으로 정렬
	}
	*/
	
	
	@Override	//Comparator를 쓸때는 TreeSet 클래스의 컨스트럭터에 지금 클래스의 인스턴스를 생성해줘야 한다.
				// ex) MemberTreeSet클래스의 디폴트 컨스트럭터
				//		public MemberTreeSet(){
				//			treeSet = new TreeSet<Member>(new Member()); --> (new Member()) 이 부분 
				//		]
						
	public int compare(Member member1, Member member2) {	//첫번째 매개변수가 Comparable의 this이고 두번쨰 매개변수가 Comparable의 매개변수라고 보면 된다. 

		return (member1.memberId - member2.memberId);	//양수면 오름차순. 
	}
}
