package ch05;

import java.util.ArrayList;

/*날짜 : 2022/09/02
 * 이름 : 황원진
 * 내용 : 연락처 정보 저장하기
 * 
 */
class Person{
	String name;
	String tel;
	
	public Person(String name, String tel) {
		this.name = name;
		this.tel=tel;
	}
}


public class P214 {
	public static void main(String[] args) {
		
		
		ArrayList<Person>list = new ArrayList();
		list.add(new Person("홍길동", "01012345678"));
		list.add(new Person("김유신", "01012345679"));
		list.add(new Person("최자영", "01012345680"));
		list.add(new Person("김영희", "01012345681"));
		
		for(Person obj : list) {
			System.out.println("("+obj.name+","+obj.tel+")");
		}
	}
}
