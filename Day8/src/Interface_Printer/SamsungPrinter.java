package Interface_Printer;

public class SamsungPrinter implements Print {

	@Override
	public void print(String p) {
		System.out.println("삼성 흑백 프린터");
	}

}

class SamsungColorPrint implements PrintColor {

	@Override
	public void print(String p) {

	}

	@Override
	public void colorPrint(String p) {

	}

}

class Sam3D_Printer implements Print3D {

	@Override
	public void colorPrint(String p) {

	}

	@Override
	public void print(String p) {

	}

	@Override
	public void D3() {

	}

}