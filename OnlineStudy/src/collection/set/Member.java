package collection.set;

public class Member {

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
}
