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
		
		int a = sc.nextInt();//배열 갯수
		int[] arr;//배열 선언
		arr = new int [a]; //배열 갯수만큼 배열 생성
		arr[0] = sc.nextInt();//첫번째 배열 입력
		int minNum = arr[0];//첫번째 배열 값으로 최소값 초기화
		int maxNum = arr[0];//첫번째 배열 값으로 최대값 초기화
		
		for(int i = 1; i < arr.length; i++ ) {
			arr[i] = sc.nextInt();//i번째 배열값 입력
			if(maxNum<arr[i]) {
				maxNum=arr[i];//최대값 업데이트
			}else if (minNum>arr[i]) {
				minNum=arr[i];//최소값 업데이트
			}
		}
		System.out.println(minNum +" "+ maxNum);
	}

}
