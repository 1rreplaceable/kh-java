import java.awt.Image;

// 주민등록증 자료형 만들 것
// class
class asd { // 틀 new int[6]

	String name;
	String a;
	String b;
	String c;
	int d;
	Image e;

}

class 카드 {
	String 카드번호;
	String 카드명;
	String 소유자;
	int cvc;
	String 등급;
	
}



class parking {
	int inTime;
	int outTime;
	String carNum;
	boolean sale;
}

class student{
	String name;
	int bitrh;
	String address;
	String phNum;
	String sex;
}
public class ClassEx01 {

	public static void main(String[] args) {
		// 사용자 정의 자료형
		// 기본자료형 int, float, double, char

		// 프로그래머가 프로그램에 맞게 다양한 기존 자료형으로
		// 새로운 자료형을 만든다
		// - 타입이 다른 자료형을 묶는다

		// 배열은 동일한 자료형(데이터 타입) 여러개를 선언
		// 클래스 다른 자료형으로 여러개를 선언

		// 객체 지향 프로그래밍
		// - 조립식 프로그래밍
		// ex) 자전거(프로그램) = 몸체(객체) + 바퀴 + 핸들

		// 조립식 프로그램의 좋은 점(장점)
		// - 재활용성이 높다 (재사용)
		// - 확장성
		// - 관리 쉽다
		student a = new student();
		a.address = "경기도 시흥시 정왕동";
		a.bitrh = 981205;
		a.name = "최석진";
		a.phNum = "010-4936-3623";
		a.sex = "남";
		
		
	}

}
