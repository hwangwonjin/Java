package sub7;
/*
 * 날짜 : 2022/09/28
 * 이름 : 황원진
 * 내용 : 자바 총정리
 */
class Artists{
	public String name;
	public String country;
	public int brith;
	
	public Artists(String name, String country, int brith) {
		this.name = name;
		this.country = country;
		this.brith  = brith;
	}
	
	
	public String show() {
		return String.format("%s, %s, %d", name, country, brith);
	}
}



public class Test02 {
	public static void main(String[] args) {
		Artists[] famousArts = {
				 new Artists("레오나르도 다빈치","이탈리아",1452),	
				 new Artists("미켈란젤로","이탈리아",1475),	
				 new Artists("빈센트 반 고흐","네덜란드",1853),	
				 new Artists("클로드 모네","프랑스",1840),	
				 new Artists("파블로 피카소","스페인",1881)	
					
			};
			for(Artists art : famousArts) {
				System.out.println(art.show());
			}
	}
	
}