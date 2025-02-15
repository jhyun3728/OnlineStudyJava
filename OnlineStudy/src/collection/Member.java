package collection;

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
	
	
}
