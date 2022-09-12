package step04;

import java.util.Scanner;

/*날짜 : 2022/09/04
 *이름 : 황원진
 *내용 : 백준 4단계 4번 문제 평균
 */
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double[] arr = new double[a];
		double max = 0;
		double sum = 0;
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
			}
			sum += arr[i];
		}
		System.out.println(sum/max*100/a);
	}
		
}
