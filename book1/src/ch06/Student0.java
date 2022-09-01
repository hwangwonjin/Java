package ch06;
/*날짜:2022/09/01
 * 이름 : 황원진
 * 내용 : Static 변수 사용하기
 * 페이지: 182
 */
public class Student0 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student0() {
		serialNum++;
		studentID = serialNum;
	}
	
	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
