package ch06;
/*날짜:2022/09/01
 * 이름 : 황원진
 * 내용 : Static 변수 사용하기
 * 페이지: 182
 */
public class Student0 {
	private static int serialNum = 1000;
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
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	
	}
	
	public static void setSerialNum() {
		Student0.serialNum = serialNum;
	}
	
}
