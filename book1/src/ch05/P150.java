package ch05;
/*
 * 날짜 : 2022/08/24
 * 이름 : 황원진
 * 내용 : 참조 값 출력하기
 * 
 */
public class P150 {
	public static void main(String[] args) {
	Student student1 = new Student();
	student1.setStudentName("안승연");
	
	Student student2 = new Student();
	student2.setStudentName("안승연");
	
	System.out.println(student1);
	System.out.println(student2);
	
	
}
}
