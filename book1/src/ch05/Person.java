package ch05;
/*
 * 날짜 : 2022/08/25
 * 이름 : 황원진
 * 내용 : 생성자 만들기
 * 페이지: 153
 */
public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {}
	
	public Person(String pname) {
		name = pname;
		
	}
	
	
	public Person(String pname, float height, float weight) {
		this.name = pname;
		this.height =180;
		this.weight =70;
	}
	
	
	
	
	
}
