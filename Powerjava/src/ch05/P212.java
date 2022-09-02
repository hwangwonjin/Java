package ch05;

import java.util.Scanner;

/*날짜 : 2022/09/02
 * 이름 : 황원진
 * 내용: 객체 배열 만들기
 * 
 */
class Movie{
	String titel, director;
	static int count;
	public Movie(String titel, String director) {
			this.titel =titel;
			this.director = director;
			count++;
	}
}


public class P212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie [] list = new Movie[10];
		list[0] = new Movie("백투더 퓨쳐","로버트 저메키스");
		list[1] = new Movie("티파니에서 아침을 ", "에드워드 블레이크");
		
		for(int i =0; i<Movie.count; i++) {
			System.out.println("===================");
			System.out.println("제목 :"+list[i].titel);
			System.out.println("제목 : "+list[i].director);
			System.out.println("======================");
		}
		
	}
}
