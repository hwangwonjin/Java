package ch12;
/*날짜 : 2022/09/17
 *이름 : 황원진
 *내용 : Member 클래스 구현하기
 *페이지 : 427
 */
public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
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
	
	@Override
		public String toString() {
			return memberName +" 회원님의 아이디는 "+memberId+"입니다.";
		}
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId ==member.memberId)
			return true;
			else
				return false;
		}
	
		return false;
	}
	
	public int compareTo(Member member) {
		return (this.memberId - member.memberId);
	}
}
