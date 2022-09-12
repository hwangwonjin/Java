package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/28
 * 이름 : 황원진
 * 내용 : 백준 4단계 1번 최소,최대
 * 
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		arr[0] = sc.nextInt();
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
			}else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min+" "+max);
	}

}
