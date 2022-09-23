package ch12;
/*날짜 : 2022/09/23
 *이름 : 황원진
 *내용 : TreeSet 활용하기
 *페이지 : 431
 */

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {	
	
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
 	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member1 = ir.next();
			int tempId = member1.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member1);
				return true;
			}
			
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		
		System.out.println();
	}
}
