package ch05;
/*
 * 날짜 : 2022/08/24
 * 이름 : 황원진
 * 내용 : student 클래스에 main() 함수 추가하기
 * 
 */
public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}
}
