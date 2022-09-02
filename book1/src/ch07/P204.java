package ch07;
/*날짜 : 2022/09/02
 * 이름:황원진
 * 내용: 배열 길이만큼 출력하기
 */
public class P204 {
	public static void main(String[] args) {
	double[] date = new double[5];
	
	date[0] = 10.0;
	date[1] = 20.0;
	date[2] = 30.0;
	
	for(int i = 0; i<date.length; i++) {
		System.out.println(date[i]);
	}
}
}
