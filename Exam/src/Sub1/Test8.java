package Sub1;
/*
 * 날짜 : 2022/08/19	
 * 이름 : 황원진
 * 내용 : 자바 반복문 연습문제
 * 
 */
public class Test8 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0; i<n; i++) {
			
			for(int j=n-1; j>i ; j--) { //j>i
				System.out.print(" ");
			}
			
			for(int j = 0; j<i*2+1 ; j++) {//j<i*2+1
				System.out.print("*");
			}
			
			System.out.print("\n");
		}

	}

}
