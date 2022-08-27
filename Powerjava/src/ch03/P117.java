package ch03;
/*
 * 날짜 : 2022/08/27
 * 이름 : 황원진
 * 내용 : 극장 안의 관객 수 세기
 * 
 */
public class P117 {

	public static void main(String[] args) {
		
		int [] [] seats = {{0,0,0,1,1,0,0,0,0},
							{0,0,1,1,0,0,0,0,0,0},
							{0,0,0,0,0,1,1,1,0}};
		
		int count = 0;
		
		for(int i =0; i<seats.length; i++) 
			for(int k=0; k<seats[i].length; k++)
				count+= seats[i][k];
		
			System.out.println("현재 관객 수는 "+count+"명 입니다.");
	}
		
}
