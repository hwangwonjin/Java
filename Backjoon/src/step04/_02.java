package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/28
 * 이름 : 황원진
 * 내용 : 백준 4단계 2번 최댓값
 * 
 */
public class _02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int[] arr = new int[9];
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
				a = i+1;
			}
		}
		System.out.println(max +","+a);
	}
}