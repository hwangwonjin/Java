package step04;

import java.util.Scanner;

/*날짜 : 2022/09/04
 *이름 : 황원진
 *내용 : 백준 4단계 3번 문제 나머지
 */
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		boolean bl;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt()%42;
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			bl = false;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					bl = true;
					break;
				}
			}
			if(bl == false) {
				count++;
			}
		}
		System.out.println(count);
	}
}