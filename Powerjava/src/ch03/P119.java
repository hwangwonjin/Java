package ch03;
/*
 * 날짜 : 2022/08/27
 * 이름 : 황원진
 * 내용 : RaggedArray
 * 
 */
public class P119 {

	public static void main(String[] args) {
		
		
		int [][] ragged = new int[3][1];
		ragged[0] = new int [1];
		ragged[1] = new int [2];
		ragged[2] = new int [3];

		
		for(int r=0; r<ragged.length; r++) {
			for(int c=0; c<ragged[r].length; c++)
				ragged[r][c]=c;
				
				
				
		}
	}

}
