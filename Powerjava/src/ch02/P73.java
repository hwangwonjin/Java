package ch02;
/*
 * 날짜 : 2022/08/25
 * 이름 : 황원진
 * 내용 : 비트 연산자 실습하기
 * 
 */
public class P73 {

	public static void main(String[] args) {
		
		byte status = 0b01101110;
		System.out.println("문 열림 상태 = "+((status & 0b00000100)!=0));


	}

}
