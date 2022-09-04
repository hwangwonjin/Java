package step04;

import java.util.Scanner;

/*날짜 : 2022/09/04
 *이름 : 황원진
 *내용 : 백준 4단계 5번 문제 OX퀴즈
 */
public class _05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] arr = new String[a]; 
	
		for(int i = 0; i <a; i++) {
			arr[i] = sc.next();
			int sum = 0;
			int count = 0;
			for(int j = 0; j < arr[i].length();j++) {
				if(arr[i].charAt(j) == 'O' ) {
					count++;
					sum += count;
				}else {
					count =0;
				}
			}
			System.out.println(sum);
		}
	}
}

