package ch11;
/*날짜 : 2022/09/17
 *이름 : 황원진
 *내용 : Person 클래스 구현하기
 */
public class P380 {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("Classex.Person");
		System.out.println(pClass3.getName());
	}
}
