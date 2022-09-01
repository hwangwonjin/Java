package ch06;
/*날짜:2022/09/01
 * 이름:황원진
 * 내용 : Static 변수 테스트하기
 * 
 */
public class StudentTest1 {
	public static void main(String[] args) {
		Student0 studentlee = new Student0();
		studentlee.setStudentName("이지원");
		System.out.println(studentlee.serialNum);
		System.out.println(studentlee.studentName+"학번 : "+studentlee.studentID);
		
		Student0 studentson = new Student0();
		studentson.setStudentName("손수경");
		System.out.println(studentson.serialNum);
		System.out.println(studentson.studentName+"학번 : "+studentson.studentID);
	}
}
