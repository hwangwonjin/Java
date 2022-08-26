package ch06;
/*
 * 날짜 : 2022/08/26
 * 이름 : 황원진
 * 내용 : this 출력하기
 * 페이지 : 175
 */
public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은"+money+" 입니다");
	}
	
	
}
