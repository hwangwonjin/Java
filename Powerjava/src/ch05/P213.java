package ch05;

import java.util.ArrayList;

/*날씨 : 2022/09/02
 * 이름: 황원진
 * 내용: 동적 객체 배열
 * 
 */
public class P213 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		list.add("홍콩");
		list.add("싱가포르");
		list.add("괌");
		list.add("사이판");
		list.add("하와이");
		
		System.out.println("여행지 추천 시스템입니다");
		int index = (int)(Math.random()*list.size());
		System.out.println("추천 여행지는 "+ list.get(index));
		
		
	}
}
