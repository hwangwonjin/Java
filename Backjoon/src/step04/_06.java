package step04;

import java.util.Scanner;

/*날짜 : 2022/09/04
 *이름 : 황원진
 *내용 : 백준 4단계 6번 문제 평균은 넘겠지
 */
public class _06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int[] arr = new int[b];
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j]>sum/b) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(double)count/b*100);
		}
	}
}
