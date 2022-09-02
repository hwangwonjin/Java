package ch07;
/*날짜 : 2022/09/02
 * 이름 : 황원진
 * 내용 : 알파벳 문자와 아스키 코드 값 출력하기
 */
public class P206 {
public static void main(String[] args) {
	char[] alphabets = new char[26];
	char ch = 'A';
	
	for (int i = 0; i<alphabets.length; i++, ch++) {
		alphabets[i] = ch;
	}
	
	for(int i = 0; i<alphabets.length; i++) {
		System.out.println(alphabets[i]+","+(int)alphabets[i]);
	}
}
}
