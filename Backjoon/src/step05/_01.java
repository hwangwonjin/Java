package step05;

import java.util.Scanner;

/*날짜 : 2022/09/12
 *이름 : 황원진
 *내용 : 정수 n 개의 합
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i]; 
		}
		System.out.println(sum);
	}
}
