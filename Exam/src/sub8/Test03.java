package sub8;

import java.lang.reflect.Member;

/*날짜 : 2022/09/29
 *이름 : 황원진 
 *내용 : 자바 총정리
 */
class Mamber{
	private String name;
	private String hp;
	private int age;
	
	public Mamber(String name, String hp, int age) {
		this.name = name;
		this.hp = hp;
		this.age = age;
	}
	
	@Override
		public String toString() { // 정보호출
			// TODO Auto-generated method stub
			return String.format("%s,%s,%d", name, hp, age);
		}
	
}
public class Test03 {
	public static void main(String[] args) {
		Mamber m1 = new Mamber("김유신", "010-1234-1001",25);
		Mamber m2 = new Mamber("김춘추", "010-1234-1002",23);
		
		System.out.println(m1);
		System.out.println(m2);
		
	}
}
