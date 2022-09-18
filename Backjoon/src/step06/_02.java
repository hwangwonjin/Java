package step06;

import java.util.Scanner;

/*날짜 : 2022/09/18
 *이름 : 황원진
 *내용 : 백준 6단계 2번 숫자의 합
 */
public class _02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		int sum = 0;
	//	char ch = sc.nextLine().charAt();
		//String[] num = Integer.toString(a).split("");
		for(int i = 0; i <n; i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
