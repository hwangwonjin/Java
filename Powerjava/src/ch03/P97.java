package ch03;
/*
 * 날짜 : 2022/08/27
 * 이름 : 황원진
 * 내용 :향상된 switch 문
 * 
 */
public class P97 {

	public static void main(String[] args) {
		var day = "SAT";
		var today = "";
		
		switch(day) {
		case "SAT","SUN" -> today="주말";
		case "MON","TUS","WED","THU","FRI"-> today="주중";
		default -> System.out.println("Error");
		}
		System.out.println("오늘 "+day+"는 "+today+"입니다");
	}

}
