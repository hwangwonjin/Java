package ch12;

import java.util.HashSet;
import java.util.Iterator;

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
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();

	while(ir.hasNext()) {
		Member member = ir.next();
		int tempId = member.getMemberId();
		if(tempId == memberId) {
			hashSet.remove(member);
			return true;
		}
	}
	System.out.println(memberId +"가 존재하지 않습니다.");
	return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
