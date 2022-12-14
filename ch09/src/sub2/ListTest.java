package sub2;

import java.util.ArrayList;
import java.util.List;

/*날짜 : 2022/09/13
 * 이름 : 황원진
 * 내용 : 자료구조 List 실습하기
 */
public class ListTest {
	public static void main(String[] args) {
		
		
		//List 생성
		List<Integer> list = new ArrayList<>();
		
		
		//데이터 입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1,6);
		list.remove(2);
		
		System.out.println(list);
		
		//데이터 출력
		System.out.println("1번째 원소 : "+list.get(0));
		System.out.println("2번째 원소 : "+list.get(1));
		System.out.println("3번째 원소 : "+list.get(2));
		
		//List 크기
		System.out.println("list 크기 :"+list.size());
		
		//List 반복문
		for(int n : list) {
			System.out.print(n +" ");
		}
		System.out.println();
		
		//문자열 리스트 
		
		List<String> people = new ArrayList<>();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		
		
		
		
		
		
		
		
		
		
	}
}
