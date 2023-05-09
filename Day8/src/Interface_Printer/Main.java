package Interface_Printer;

public class Main {

	public static void main(String[] args) {

		// 흑백 프린터 잘 사용
		SamsungPrinter seohee = new SamsungPrinter();
		LgPrinter jihee = new LgPrinter();

		Sam3D_Printer hee = new Sam3D_Printer();

		Print3D p1 = hee;
		
		boolean res = p1 instanceof Print;
		System.out.println(res);
		
		res = jihee instanceof LgPrinter;
		System.out.println(res);
	}
}
//public abstract class Printer {
//
//	// 기능 print
//	abstract void print();
//
//}
//class LG_Printer extends Printer {
//
//	@Override
//	void print() {
//		System.out.println("엘지프린터");
//	}
//	
//}
//
//class Samsung_Printer extends Printer {
//
//	@Override
//	void print() {
//		System.out.println("삼성프린터");
//	}
//
