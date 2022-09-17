package ch11;
/*날짜 : 2022/09/17
 *이름: 황원진
 *내용 : String과 Integer 클래스의 HashCode() 메서드
 */
public class P364 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}
}
