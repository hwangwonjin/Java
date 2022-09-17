package ch11;
/*날짜 : 2022/09/17
 *이름 : 황원진
 *내용 :클래스 정의하기
 */
class Powder{
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	public String toString() {
	return "재료는 PoWder입니다.";	
	}
}
	class Plastic{
		public void doPrinting() {
			System.out.println("Plastic 재료로 출력합니다.");
		}
		
		public String toString() {
			return "재료는 Plastic입니다.";
		}
		
	}
	
	class GenericPrinter<T>{
		public static final Point getMaterial = null;
		private T material;
		
		public void setMaterial(T material) {
			this.material = material;
		}
		
		public String toString() {
			return material.toString();
		}

		public Plastic getMaterial() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setMaterial(Powder powder) {
			// TODO Auto-generated method stub
			
		}
	}

public class P392 {
	private static final char[] plasticPrinter = null;

	public static void main(String[] args) {
		GenericPrinter<Point> powderPrinter = new GenericPrinter<Point>();
		
		powderPrinter.setMaterial(new Powder());
		Point powder = powderPrinter.getMaterial;
		System.out.println(powderPrinter);
	
		GenericPrinter<Plastic> plaPrinter = new GenericPrinter<Plastic>();
		
		plaPrinter.setMaterial(new Plastic());
		Plastic plastic = plaPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}
}
