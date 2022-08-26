package ch05;
/*
 * 날짜 : 2022/08/25
 * 이름 : 황원진
 * 내용 : 생성자 만들기
 * 페이지: 154
 */
public class PersonTest {
	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name="김유신";
		personKim.height=180.0f;
		personKim.weight=85.5f;
		
		Person personLee = new Person("이순신", 175, 75);
		
	}
	
	
	
	
	
}
