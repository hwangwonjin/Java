package ch12;

import java.util.TreeSet;

/*날짜 : 2022/09/23
 *이름 : 황원진
 *내용 : treeSet 테스트하기
 */
public class P428 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
