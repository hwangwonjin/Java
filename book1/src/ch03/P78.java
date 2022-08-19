package ch03;
/*
 * 날짜 : 2022/08/19
 * 이름 : 황원진
 * 내용 : 단락 회로 평가 실습하기
 * 
 */
public class P78 {
	public static void main(String[] args) {
	int num1 = 10;
	int i = 2;
	
	boolean value = ((num1 = num1 + 10)<10)&&((i = i + 2)< 10);
	System.out.println(value);
	System.out.println(num1);
	System.out.println(i);
	
	boolean value1 = ((num1 = num1 + 10)>10)||((i=i+2)<10);
	System.out.println(value1);
	System.out.println(num1);
	System.out.println(i);
	
	}
}
