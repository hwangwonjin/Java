package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 황원진
 * 내용 : 백준 2단계 6번 문제 오븐시계
 * 
 */
public class _06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a<0 || a>23) || (b < 0 || b>59) || (c<0 || c > 1000)) {
			System.out.println("잘못된 입력값입니다");
		}else if((a + c/60)>23 ) { //24시간 이상일때
			
			if(b+ c%60>=60) { // 60분 이상일때
				System.out.print((a +c/60 -24 +1) +" ");//60분 이상 시간 계산식
				System.out.print(b +c%60 -60);//60분 이상 분 계산식
			}else {
				System.out.print((a +c/60 -24) +" ");//60분 언더 계산식 시간
				System.out.print(b +c%60);//60분 언더 계산식 분
			}
		}else {
			if(b+ c%60>=60) {// 분 60분 이상일때
				if(a+ c/60 == 23) {//시간이 24이 될 때 
					a = 0;
					System.out.print(a + " ");// 시간출력
				}else {
					System.out.print(a + c/60+1+ " ");// 24시간 언더일때 시간계산식
				}
				System.out.print(b +c%60 -60);//분계산
			}else {// 60분 미만일 때
				System.out.print((a +c/60) +" ");//  시간계산식
				System.out.print(b +c%60);//분 계산식
			}
		}
	}

}
