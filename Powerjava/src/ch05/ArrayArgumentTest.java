package ch05;
/*날짜 : 2022/09/01
 * 이름 : 황원진
 * 내용: 배열을 받는 메소드 작성하기
 * 페이지: 196
 * 
 */
public class ArrayArgumentTest {
	
	public static double minArray(double[] list) {
		double min = list[0];
		
		for (int i = 1; i< list.length; i++) {
			if(list[i]<min)
				min = list[i];
		}
		return (min);
		
	}
	
	
	
	public static void main(String[] args) {
	
		double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
		double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5};
		
		double min;
		
		min = minArray(a);
		System.out.println("첫 번째 배열의 최솟값 : "+min);
		min = minArray(b);
		System.out.println("두번째 배열의 최솟값 : "+min);
		
}
}