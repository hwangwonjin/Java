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
		int x = 1;
		int[] arr;//배열선언
		arr = new int[9];//배열개수
		arr[0] = sc.nextInt();//첫번째 배열 입력
		int max = arr[0];//첫번째 배열값으로 최댓값 초기화
		for(int i = 1; i<arr.length; i++) {
			arr[i] = sc.nextInt();//i번째 배열값
			if(max<arr[i]) {
				max=arr[i];
				 x = i+1;
			}
		}
		System.out.println(max+" " + x);
	}

}
