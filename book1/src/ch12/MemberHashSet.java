package ch12;

import java.util.HashSet;

/*날짜: 2022/09/19
 *이름: 황원진
 *내용 : HashSet 활용하기
 */
public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
}
