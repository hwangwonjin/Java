package sub8;

import java.util.StringTokenizer;

/*날짜 : 2022/09/29
 *이름 : 황원진 
 *내용 : 자바 총정리
 */
public class Test01 {
	public static void main(String[] args) {
		
		String[] arr1 = {"Apple", "Banana", "Grape","Orange"};
		String result1 = String.join("-", arr1);
		System.out.println("result1 : "+result1);
		
		String[] arr2 = result1.split("-");
		String result2 = String.join("", arr2);
		System.out.println("result2 : "+result2);
		
		String[] arr3 = result2.split("(?=[A-Z])");//정규표현식
		String result3 = String.join("^", arr3);
		System.out.println("result3 : "+result3);
		
		StringTokenizer st = new StringTokenizer(result3,"^");//특화된 String 문자 쪼개기
		StringBuilder sb = new StringBuilder();//문자를 연결
		
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		
		String result4 = sb.toString();
		System.out.println("retult : "+result4);
	}
	
	
}
