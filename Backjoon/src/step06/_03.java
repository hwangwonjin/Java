package step06;

import java.util.Scanner;

/*날짜 : 2022/09/25
 *이름 : 황원진
 *내용 : 백준 5단계 3번 문제 알파벳 찾기
 */
public class _03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		for(char c = 'a'; c <= 'z'; c++ ) {
			System.out.print(s.indexOf(c)+" ");
		}
		
		
	}

}

/* 아스키코드 구현 방법
 * 
 * String s = in.next();
        int arr[] = new int[26];
        
        Arrays.fill(arr, -1);
        
        for(int i = 0; i<s.length();i++){   = 배열의 갯수 만큼 	반복시행
        	if(arr[s.charAt(i)- 97] == -1)  = 초기화로 중복배제
        	arr[s.charAt(i)- 97] = i;       = 입력된 해당 문자의 배열의 위치 
           
        }
        
        for(int i =0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        
        in.close();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
