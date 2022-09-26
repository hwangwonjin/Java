package ch12;
/*날짜 : 2022/09/23
 *이름 : 황원진
 *내용 : Comparator 인터페이스 사용하기
 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1;
	}
	
}



public class P437 {
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();
	}
}
