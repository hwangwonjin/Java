package ch11;
/*날짜 : 2022/09/17
 *이름 : 황원진
 *내용 : 인스턴스 생성하기
 */
public class P383 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pclass = Class.forName("ch11.Person");
		Person person2 =(Person)pclass.newInstance();
		System.out.println(person2);
		
		
	}
}
