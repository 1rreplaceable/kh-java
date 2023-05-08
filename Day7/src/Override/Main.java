package Override;

class Shape {
	String name;

	double area() {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("%s의 넓이 -> ", name) + area();
	}

}

class Square extends Shape {
	int line;

	@Override
	double area() {
		double area = line * line;
		return area;
	}
}

class Triangle extends Shape {
	int dLine;
	int hei;

	@Override
	double area() {
		double area = dLine * hei / 2;
		return area;
	}

}

class Circle extends Shape {
	int radius;

	@Override
	double area() {
		double area = radius * radius * 3.14;
		return area;
	}
}

public class Main {

	public static void main(String[] args) {

		Square s = new Square();
		s.name = "정사각형";
		s.line = 5;
		Triangle t = new Triangle();
		t.name = "삼각형";
		t.dLine = 4;
		t.hei = 3;
		Circle c = new Circle();
		c.name = "원";
		c.radius = 4;

		Shape sh1 = s;
		Shape sh2 = t;
		Shape sh3 = c;

		Shape[] shs = { sh1, sh2, sh3 };

		for (int i = 0; i < shs.length; i++) {
			System.out.println(shs[i].toString());
		}
	}

}
