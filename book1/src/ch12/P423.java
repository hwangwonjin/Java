package ch12;

import java.util.HashSet;


/*날짜 : 2022/09/19
 *이름: 황원진
 *내용 : HashSet 테스트하기
 */
public class P423 {
	public static void main(String[] args) {
		HashSet<String> hashSet;
		hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet);
	}
}
