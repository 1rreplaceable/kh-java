package Override;

public class Point {

	// 좌표를 저장하는 클래스
	int x;
	int y;

	@Override
	public String toString() {
		return "x:" + x + "y:" + y;
	}
	
	// 좌표를 출력하는 메서드
	void info() {
		System.out.println("x:" + x + "y:" + y);
	}
}

class Point3D extends Point {

	int z;

	@Override
	void info() {
		System.out.println("x:" + x + "y:" + y + "z:" + z);
	}
	
	

}
