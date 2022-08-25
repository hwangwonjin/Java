package ch02;
/*
 * 날짜 : 2022/08/23
 * 이름 : 황원진
 * 내용 : 증감, 복합 대입 연산자 실습하기
 * 
 */
public class P71 {

	public static void main(String[] args) {
		int x = 1, y = 1;
		
		int a= x++;
		int b= ++y;
		System.out.println("a = " +a+", b = "+b);

		int c = 100, d= 200;
		c += 10;
		d /= 10;
		System.out.println("c = "+c+", d =" +d);
		
		
	
		
	}

}
