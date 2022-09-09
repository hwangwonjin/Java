package ch08;

import java.util.Calendar;

/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : Calendar 클래스
 */
public class P350 {
	public static void main(String[] args) {
		Calendar d = Calendar.getInstance();
		System.out.println(d);
		System.out.println(d.get(Calendar.YEAR)+"년");
		System.out.println(d.get(Calendar.MONTH)+1+"월");
		System.out.println(d.get(Calendar.DATE)+"일");
		
		
		d.set(Calendar.HOUR, 12);
		d.set(Calendar.MONTH,34);
		d.set(Calendar.SECOND,0);
		System.out.println(d);
	}
}
