package sub01;
/*
 * 날짜 : 2022/08/22
 * 이름 : 황원진
 * 내용 : 자바 배열 실습하기
 * 
 * 배열 
 * 하나 이상의 데이터를 하나의 변수에 저장힐 수 있는 자료구조
 * 현대의 프로그래밍에서는 Array 대신 List 를  더많이 사용
 * 
 * 
 */
public class ArrayTest1 {
 public static void main(String[] args) {
	//배열
	 int[] arr1 = {1, 2, 3, 4, 5};
	 char[] arr2 = {'A', 'B', 'C'};
	 String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
	 
	 //배열 원소 출력
	 System.out.println("arr1[0] : " +arr1[0]);
	 System.out.println("arr1[2] : " +arr1[2]);
	 System.out.println("arr1[4] : " +arr1[4]);
	 
	 System.out.println("arr2[0] : "+arr2[0]);
	 System.out.println("arr2[1] : "+arr2[1]);
	 
	 System.out.println("arr3[1] : "+arr3[1]);
	 System.out.println("arr3[3] : "+arr3[3]);
	 System.out.println("arr3[2] : "+arr3[2]);
	 
	 //배열 길이
	 System.out.println("arr1의 배열 길이 : "+arr1.length);
	 System.out.println("arr2의 배열 길이 : "+arr2.length);
	 System.out.println("arr2의 배열 길이 : "+arr3.length);
	 
	 //배열 반복문
	 for(int i = 0; i<arr1.length; i++) {
		 System.out.print(arr1[i]+" ");
	 }
	 
	 System.out.println();
	 
	 for(char ch :arr2) {
		 System.out.print(ch+" ");
	 }
	 
	 System.out.println();
	 
	 for(String st :arr3) {
		 System.out.print(st+ " ");
	 }
	 
	 
	 
	 //1차원 배열 
	 int[] scores = {80, 60, 78, 62, 92};
	 int total = 0;
	 
	 
	/* for(int score : scores) {
		 total += score;
	 }
	 System.out.println("scorce의 합 : "+total);
	 */
	  for(int i =0; i<scores.length; i++ ) {
	  total += scores[i];
		}
	System.out.println("scorce의 합 : "+total);
	 
	
	 
	 //2차원 배열
	 int[][] arr2d = {{1, 2, 3, 4}, 
			 		  {5, 6, 7, 8}, 
			 		  {9,10,11,12}};
	 System.out.println("arr2d[0][0] : "+arr2d[0][0]);
	 System.out.println("arr2d[0][1] : "+arr2d[0][1]);
	 System.out.println("arr2d[0][2] : "+arr2d[0][2]);
	 System.out.println("arr2d[0][3] : "+arr2d[0][3]);
	 System.out.println("arr2d[1][0] : "+arr2d[1][0]);
	 System.out.println("arr2d[1][1] : "+arr2d[1][1]);
	 System.out.println("arr2d[1][2] : "+arr2d[1][2]);
	 System.out.println("arr2d[1][3] : "+arr2d[1][3]);
	 System.out.println("arr2d[2][0] : "+arr2d[2][0]);
	 System.out.println("arr2d[2][1] : "+arr2d[2][1]);
	 System.out.println("arr2d[2][2] : "+arr2d[2][2]);
	 System.out.println("arr2d[2][3] : "+arr2d[2][3]);
	 
	 for(int a =0; a < 3; a++) {
		 for(int b = 0; b < 4; b++) {
			 System.out.println("arr2d["+a+"]["+b+"] : "+arr2d[a][b]);
		 }
	 }
	 
	 
	 //3차원 배열
	 
	 int[][][] arr3d = {{{1, 2, 3},
		 				 {4, 5, 6},
		 				 {7, 8, 9}},	
			 			{{10,11,12},
		 				 {13,14,15},
		 				 {16,17,18}},
			 			{{19,20,21},
		 				 {22,23,24},
		 				 {25,26,27}}};
	 for(int a =0; a < 3; a++) {
		 for(int b =0; b<3; b++) {
			 for(int c =0; c<3;  c++) {
				 System.out.printf("arr3d[%d][%d][%d] : %d\n",a, b, c ,arr3d[a][b][c]);
				 	//a가 행 b가 세로 c가 가로 그래서 b와 c의 위치를 바꾸니 가로 먼저 읽음
			 }
		 }
	 }
	 
	 
	 
	 
}
}
