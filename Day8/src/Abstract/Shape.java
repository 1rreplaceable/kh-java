package Abstract;

public abstract class Shape {

	// 도형 클래스
	// draw() 메서드를 추상화 한다
	// 정삼각형을 그린다
	// 정사각형을 그린다
	// 원을 그린다
	// 선을 그린다
	abstract void draw();
	
}
class Triangle extends Shape {
	@Override
	void draw() {
		
	}

}
class Rectangle extends Shape {
	@Override
	void draw() {
		
	}
}
class Circle extends Shape {
	@Override
	void draw() {
		
	}
}
class Line extends Shape {
	@Override
	void draw() {
		
	}
}