package step05;

import java.util.Scanner;
/*날짜 : 2022/09/18
 *이름 : 황원진
 *내용 : 백준 5단계 3번 한수
 */
public class _03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //숫자 N입력
		int count = 0; //한수 개수 카운팅
		for (int i = 1; i <= num; i++) { //입력 범위가 1이상이므로 1부터 시작.
			if (i <= 99) { //1~99까지는 모두 한수이므로 무조건 +1
				count += 1;
			} else if (i <= 999) { //100부터는 조건을 확인해서 한수 조건을 충족하면 +1
				if (((i/10)%10-i/100) == (i%10-(i/10)%10)) { //백의자리 십의자리 일의자리를 각각 a, b, c라고 생각하고 b-a == c-b 이면 한수이므로 +1
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
		
}


