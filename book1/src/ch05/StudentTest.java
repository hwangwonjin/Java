package ch05;
/*
 * 날짜 : 2022/08/24
 * 이름 : 황원진
 * 내용 : private 변수 테스트하기
 * 
 */
public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}

}
