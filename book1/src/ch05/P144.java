package ch05;
/*
 * 날짜 : 2022/08/24
 * 이름 : 황원진
 * 내용 : student 클래스에 main() 함수 추가하기
 * 
 */
public class P144 {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public static void main(String[] args) {
		Student studentAhn = new Student();
		student.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}
}
