package ch07;

import java.util.ArrayList;

/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : student 클래스 구현하기
 *페이지 : P227
 */
public class Student {
	int studentId;
	String studentName;
	ArrayList<Subject>subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생"+studentName+"의"+s.getName()+"과목 성적은"+s.getScorePoint()+"입니다.");
		}
		System.out.println("학생"+studentName+ "의 총점은"+total+"입니다.");
	}
	
}
