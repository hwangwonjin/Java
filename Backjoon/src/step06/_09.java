package step06;

import java.util.Scanner;

/*날짜 : 2022/10/03
 *이름: 황원진
 *내용 : 백준 6단계 9번 크로아티아 알파벳
 */
public class _09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String s = sc.next();
		
		for(int i = 0; i < str.length; i++) {
			if(s.contains(str[i])) {
				s = s.replace(str[i], "!");
			}
		}
		System.out.println(s.length());
	}

}
