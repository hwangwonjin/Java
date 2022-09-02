package ch07;
/*날짜 : 2022/09/02
 * 이름 : 황원진
 * 내용 : 배열의 유효한 요소 값 출력하기
 */
public class P205 {
	public static void main(String[] args) {
		double[] date = new double[5];
		int size = 0;
		
		date[0]= 10.0; size++;
		date[1] = 20.0; size++;
		date[2]	= 30.0; size++;
		
		for(int i = 0; i<size; i++) {
			System.out.println(date[i]);
		}
	}
}
