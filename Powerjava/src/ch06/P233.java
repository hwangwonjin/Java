package ch06;
/*날짜 : 2022/09/03
 * 이름: 황원진
 * 내용: Person 클래스와 Student 클래스 만들어보기
 */
class Person{
	private String regnumber;
	private double weight;
	protected int age;
	String name;
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}

class Student extends Person{
	int id;
}


public class P233 {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.age = 21;
		s1.name = "kim";
		s1.setWeight(75.0);
		s1.id =20221011;
		System.out.println("id : " +s1.id);
		System.out.println(s1.getWeight());
	
	}
}
