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
		double[] arr =  new double[a];
		double sum = 0.0;
		double max = arr[0];
		for(int i = 0; i <arr.length; i++) {
			arr[i] = sc.nextInt();
//		}
//		for(int i = 0; i < arr.length; i++) {
			if(max<arr[i]) 
				max=arr[i];		
//		}
		
//		for(int i = 0; i < arr.length; i++ ) {
//			arr[i] = arr[i]/max * 100;
		//	System.out.println(arr[i]);
//		}
//		for(int i = 0; i < arr.length; i++) {
			 sum += arr[i];
		}
		System.out.println(sum/a/max*100);
	}

}
